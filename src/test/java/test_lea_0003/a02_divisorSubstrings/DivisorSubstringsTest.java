package test_lea_0003.a02_divisorSubstrings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DivisorSubstringsTest {
    private Solution cut;

    @BeforeEach
    void setUp() {
        cut = new Solution();
    }

    @ParameterizedTest
    @MethodSource("getInputData")
    void test(int n, int k, int expectedResult) {
        assertEquals(expectedResult, cut.divisorSubstrings(n, k));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(of(120, 2, 2), of(555, 1, 1), of(5341, 2, 0));
    }
}
