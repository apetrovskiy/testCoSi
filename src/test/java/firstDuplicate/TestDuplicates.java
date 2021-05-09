package firstDuplicate;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestDuplicates {
    static Stream getInputData() {
        return Stream.of(
            Arguments.of(new int[]{2, 1, 3, 5, 3, 2}, 3),
            Arguments.of(new int[]{2, 2}, 2),
            Arguments.of(new int[]{2, 4, 3, 5, 1}, -1),
            Arguments.of(new int[]{1, 1, 2, 2, 1}, 1),
            Arguments.of(new int[]{1, 1, 2, 2, 1,1, 1, 2, 2, 1,1, 1, 2, 2, 1,1, 1, 2, 2, 11, 1, 2, 2, 11, 1, 2, 2, 11, 1, 2, 2, 1}, 1),
            Arguments.of(getOneMillionOfIntegers(), 3),
            Arguments.of(generateArrayOfSame(10000000), 1)
        );
    }

    private static int[] getOneMillionOfIntegers() {
        return IntStream.range(0, 100)
                .toArray();
    }

    private static int[] generateArrayOfSame(int length) {
        return IntStream.generate(() -> 1).limit(length).toArray();
    }

    @Disabled
    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldReturnDuplicate(int[] input, int expectedResult) {
        final var cut = new Duplicates();

        Assertions.assertEquals(expectedResult, cut.findFirstValidDuplicate(input));
    }
}
