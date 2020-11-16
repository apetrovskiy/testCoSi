package test_sa_0002.a01_spiderMove

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task001TestK {
    @Test
    fun test01() {
        val actualResult = Task0001Java().spiderMove(2, -2)
        assertEquals(6, actualResult)
    }

    @Test
    fun test02() {
        val actualResult = Task0001Java().spiderMove(-3, 0)
        assertEquals(1, actualResult)
    }

    @Test
    fun test03() {
        val actualResult = Task0001Java().spiderMove(0, 0)
        assertEquals(1, actualResult)
    }

    @Test
    fun test04() {
        val actualResult = Task0001Java().spiderMove(5, 7)
        assertEquals(1, actualResult)
    }
}
