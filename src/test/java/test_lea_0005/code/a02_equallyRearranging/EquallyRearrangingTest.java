package test_lea_0005.code.a02_equallyRearranging;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class EquallyRearrangingTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void testBouncingDiagonals(String inputData, String expectedResult) {
        assertEquals(expectedResult, new Solution().equallyRearranging(inputData));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(
            of("LDWDL", "WDLDL"),
            of("LDDL", "DLDL"),
            of("L", "L")
        );
    }
}
