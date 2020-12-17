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
                of(new int[][]{new int[]{1, 3, 2, 5}, new int[]{3, 2, 5, 0}, new int[]{9, 0, 1, 3}, new int[]{6, 1, 0, 8}}, new int[]{1, 9, 3, 6}),
                of(new int[][]{new int[]{3, 4}, new int[]{1, 2}}, new int[]{1, 3}),
                of(new int[][]{new int[]{10, 2, 4, 10, 10}, new int[]{1, 5, 9, 2, 0}, new int[]{6, 6, 1, 1, 2}, new int[]{5, 7, 9, 7, 6}, new int[]{3, 3, 5, 10, 10}}, new int[]{1, 6, 3, 5, 10}),
                of(new int[][]{new int[]{95, 95, 96, 91, 100}, new int[]{98, 97, 96, 91, 93}, new int[]{99, 93, 90, 93, 91}, new int[]{91, 93, 94, 94, 94}, new int[]{94, 92, 99, 91, 90}}, new int[]{91, 95, 94, 99, 98}),
                of(new int[][]{new int[]{5, 4, 4, 10, 4, 1, 1}, new int[]{10, 5, 5, 3, 6, 10, 8}, new int[]{3, 5, 9, 7, 3, 3, 7}, new int[]{2, 3, 10, 7, 6, 4, 2}, new int[]{10, 1, 9, 4, 7, 3, 3}, new int[]{2, 2, 5, 1, 6, 7, 8}, new int[]{9, 1, 3, 2, 8, 9, 6}}, new int[]{3, 2, 2, 9, 10, 5, 10})
        );
    }
}
