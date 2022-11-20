package countPairs;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CounterTest {
    static Stream getInputData() {
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3}, new int[] {1, 2, 3}, 31, 2),
                Arguments.of(new int[] {16, 1, 4, 2, 14}, new int[] {7, 11, 2, 0, 15}, 743, 4));
    }

    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldCounbtPairs(int[] inputArray01, int[] inputArray02, int max, int expectedResult) {
        final var actualResult = new Counter().count(inputArray01, inputArray02, max);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
