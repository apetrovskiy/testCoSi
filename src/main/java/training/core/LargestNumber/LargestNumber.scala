package training.core.LargestNumber

object SolutionScala {
  def largestNumber(n: Int): Int = {
    var result = 9
    var i = 1
    while (i < n) {
      result = result + 9 * math.pow(10, i).toInt
      i = i + 1
    }
    result
  }
}
