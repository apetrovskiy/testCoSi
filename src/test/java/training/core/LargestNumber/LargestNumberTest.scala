package training.core.LargestNumber

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.Arguments.of;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@Epic("epic Training")
@Feature("feature Core")
@Story("story Largest number")
@DisplayName("suite Largest number")
@Tag("tag Scala")
class LargestNumberScalaTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
  @DisplayName("Largest number test")
  def shouldCalculateNumber(input: Int, expectedResult: Int) = {
    assertEquals(expectedResult, SolutionScala.largestNumber(input))
  }
}

object LargestNumberScalaTest {
  def getInputData(): Stream[Arguments] = {
    Stream.of(
      of(1, 9),
      of(2, 99),
      of(3, 999),
      of(9, 999999999)
    )
  }
}
