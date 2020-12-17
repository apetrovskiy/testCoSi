package test_lea_0005.code.a01_goodTuples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GoodTuplesTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void testBouncingDiagonals(int[] inputData, int expectedResult) {
        assertEquals(expectedResult, new Solution().goodTuples(inputData));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(
            of(new int[]{1, 1, 1, 2, 1, 3, 4}, 2),
            of(new int[]{1, 1, 2, 1, 2, 1, 1}, 5)
        );
    }
}
