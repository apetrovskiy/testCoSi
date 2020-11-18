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
            of(),
            of()
        );
    }
}
