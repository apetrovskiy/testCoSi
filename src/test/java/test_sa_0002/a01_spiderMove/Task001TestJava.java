package test_sa_0002.a01_spiderMove;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Task001TestJava {
    @Test
    void test01() {
        final int actualResult = new Task0001Java().spiderMove(2, -2);
        assertEquals(6, actualResult);
    }

    @Test
    void test02() {
        final int actualResult = new Task0001Java().spiderMove(-3, 0);
        assertEquals(1, actualResult);
    }

    @Test
    void test03() {
        final int actualResult = new Task0001Java().spiderMove(0, 0);
        assertEquals(1, actualResult);
    }

    @Test
    void test04() {
        final int actualResult = new Task0001Java().spiderMove(5, 7);
        assertEquals(1, actualResult);
    }
}
