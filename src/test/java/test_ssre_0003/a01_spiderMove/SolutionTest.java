package test_ssre_0003.a01_spiderMove;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void test(int x, int y, int expectedResult) {
        final int actualResult = new Solution().spiderMove(x,y);
        assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(
            of(2, -2, 6),
            of(-3, 0, 1),
            of(0, 0, 1),
            of(0, 10, 1),
            of(5, 7, 792)
        );
    }
}

/*
Test 1
Input:
x: 2
y: -2
Expected Output:
6
Click the "Run Tests" button to see output and console logs.

Test 2
Input:
x: -3
y: 0
Expected Output:
1
Click the "Run Tests" button to see output and console logs.

Test 3
Input:
x: 0
y: 0
Expected Output:
1
Click the "Run Tests" button to see output and console logs.

Test 4
Input:
x: 0
y: 10
Expected Output:
1
Click the "Run Tests" button to see output and console logs.

Input:
x: 5
y: 7
Expected Output:
792
Click the "Run Tests" button to see output and console logs.
*/
