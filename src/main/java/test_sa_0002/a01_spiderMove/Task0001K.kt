package test_sa_0002.a01spiderMove

import kotlin.math.abs

class Task0001K {
    fun spiderMove(x1: Int, y1: Int): Int {

        var x = abs(x1)
        var y = abs(y1)

        var n = IntArray(x + 1)
        for (i: Int in 0..x + 1) {
            n[i] = 1
        }

        for (i: Int in 0..y) {
            for (j: Int in 1..x + 1) {
                n[j] = n[j - 1] + n[j]
            }
        }
        return n[x+1] + n[y]
    }
}
