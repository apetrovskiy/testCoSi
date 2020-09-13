package meanValueGroups;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GroupCalculatorTest {
    @Test
    void shouldReturnMeanGroups() {
        final var inputArray = new int[][]{{3, 3, 4, 2},
                {4, 4},
                {4, 0, 3, 3},
                {2, 3},
                {3, 3, 3}};
        final var expectedResult = new int[][] {{0, 4},
                 {1},
                 {2, 3}};

        final var actualResult = new GroupCalculator().calculate(inputArray);

        Arrays.asList(actualResult)
                .forEach(item -> System.out.println("first = " + item[0]));

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void show() {
//        final var inputArray = new int[]{3,
//                4,
//                2,
//                2,
//                3};
        final var inputArray = new int[][]{{3, 3, 4, 2},
                {4, 4},
                {4, 0, 3, 3},
                {2, 3},
                {3, 3, 3}};

        final var actualResult = new GroupCalculator().calculate1(inputArray);
    }
}
