package mutateArr;

import java.util.stream.IntStream;

@SuppressWarnings("PMD")
public class Mutator {
  public int[] mutate(int n, int[] a) {
    if (0 == n || n > a.length || null == a || 0 == a.length) {
      return new int[] {};
    }

    return IntStream.range(0, n)
        .map(
            index ->
                0 == index && n - 1 == index
                    ? a[index]
                    : 0 == index
                        ? a[index] + a[index + 1]
                        : n - 1 == index
                            ? a[index - 1] + a[index]
                            : a[index - 1] + a[index] + a[index + 1])
        .toArray();
  }
}
