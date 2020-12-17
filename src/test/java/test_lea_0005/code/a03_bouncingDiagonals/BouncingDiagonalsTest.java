package test_lea_0005.code.a03_bouncingDiagonals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BouncingDiagonalsTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void testBouncingDiagonals(int[][] matrix, int[] expectedResult) {
        assertArrayEquals(expectedResult, new Solution().bouncingDiagonals(matrix));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(
                of(new int[][]{new int[]{2, 3, 2}, new int[]{0, 2, 5}, new int[]{1, 0, 1}}, new int[]{1, 2, 0}),
                of(new int[][]{new int[]{1, 3, 2, 5}, new int[]{3, 2, 5, 0}, new int[]{9, 0, 1, 3}, new int[]{6, 1, 0, 8}}, new int[]{1, 9, 3, 6})
        );
    }
}
