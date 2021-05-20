package training.core.LargestNumber

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class LargestNumberScalaTest {
  @ParameterizedTest
  @MethodSource(Array("getInputData"))
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
