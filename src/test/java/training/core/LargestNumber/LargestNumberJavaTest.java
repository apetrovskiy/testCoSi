package training.core.LargestNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@Epic("Training")
@Feature("Core")
@Story("Java")
@DisplayName("Largest number")
@Tag("Java")
class LargestNumberJavaTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    @DisplayName("Largest number test")
    void shouldCalculateNumber(int input, int expectedResult) {
        assertEquals(expectedResult, new Solution().largestNumber(input));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(of(1, 9), of(2, 99), of(3, 999), of(9, 999_999_999));
    }
}
