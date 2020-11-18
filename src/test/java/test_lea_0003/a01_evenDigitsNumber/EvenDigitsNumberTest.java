package test_lea_0003.a01_evenDigitsNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenDigitsNumberTest {
    @Test
    void test01() {
        final int actualResult = new EvenDigitsNumber().evenDigitsNumber(new int[] { 12, 134, 111, 1111, 10 });
        assertEquals(3, actualResult);
    }
}
