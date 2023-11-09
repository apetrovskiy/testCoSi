package training.core.LargestNumber

import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@Epic("epic Training")
@Feature("feature Core")
@Story("story Largest number")
@DisplayName("suite Largest number")
class LargestNumberKtTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    @Tags(Tag("tag Kotlin"))
    @DisplayName("test Largest number")
    fun shouldCalculateNumber(input: Int, expectedResult: Int) {
        assertEquals(expectedResult, LargestNumberKt().largestNumber(input))
    }
    companion object {
        @JvmStatic
        fun getInputData(): Stream<Arguments> {
            return Stream.of(of(1, 9), of(2, 99), of(3, 999), of(9, 999_999_999))
        }
    }
}
