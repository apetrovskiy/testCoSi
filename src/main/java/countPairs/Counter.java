package countPairs;

import java.util.stream.IntStream;

public class Counter {
    int count(int[] a, int[] b, int k) {
        if (null == a || null == b || a.length != b.length || 0 == a.length || 0 == k) {
            return 0;
        }

        var counter = IntStream.range(0, a.length)
            .map((int index) ->
                a[index] * (int)Math.pow(10.0, String.valueOf(b[b.length - 1 - index]).length()) + b[b.length - 1 - index] < k ? 1 : 0);

        return counter.sum();
    }
}
