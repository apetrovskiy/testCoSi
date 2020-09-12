package firstDuplicate;

import java.util.Arrays;
import java.util.Comparator;

public class Duplicates {
    public int findFirstValidDuplicate(int[] a) {
        if (null == a || 0 == a.length) {
            return 0;
        }
        final Object[] uniqueElements = Arrays.stream(a).parallel()
                .distinct()
                .boxed()
                .toArray();

        final Object[] validInput = Arrays.stream(a).parallel().boxed().toArray();
        final Integer positionInArray = Arrays.stream(uniqueElements).parallel()
                .filter(item -> Arrays.asList(validInput).indexOf(item) != Arrays.asList(validInput).lastIndexOf(item))
                .map(item -> Arrays.asList(Arrays.stream(validInput).skip(Arrays.asList(validInput).indexOf(item) + 1).toArray()).indexOf(item) + Arrays.asList(validInput).indexOf(item) + 1)
                .min(Comparator.comparingInt(item -> item))
                .orElse(-1);
        return positionInArray > 0 ? a[positionInArray] : -1;
    }
}
