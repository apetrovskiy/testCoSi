package training.core.LargestNumber
class LargestNumber {
    fun largestNumber(n: Int): Int {
        var result = 9
        var i = 1
        while (i < n) {
            result += 9 * Math.pow(10.toDouble(), i.toDouble()).toInt()
            i++
        }
        return result
    }
}
