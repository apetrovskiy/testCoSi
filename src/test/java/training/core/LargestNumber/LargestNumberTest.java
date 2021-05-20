package training.core.LargestNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class LargestNumberTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldCalculateNumber(int input, int expectedResult) {
        assertEquals(expectedResult, new Solution().largestNumber(input));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(of(1, 9), of(2, 99), of(3, 999), of(9, 999_999_999));
    }
}