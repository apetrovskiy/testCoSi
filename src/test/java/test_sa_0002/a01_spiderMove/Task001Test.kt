package test_sa_0002.a01_spiderMove

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Task001Test {
    @Test
    fun test01() {
        assertEquals(6, Task0001().spiderMove(2, -2))
    }

    @Test
    fun test02() {
        assertEquals(1, Task0001().spiderMove(-3, 0))
    }

    @Test
    fun test03() {
        assertEquals(1, Task0001().spiderMove(0, 0))
    }

    @Test
    fun test04() {
        assertEquals(1, Task0001().spiderMove(5, 7))
    }
}
