package mutateArr;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@SuppressWarnings("PMD")
public class TestMutator {
    static Stream getInputData() {
        return Stream.of(
            Arguments.of(5, new int[]{4, 0, 1, -2, 3}, new int[]{4, 5, -1, 2, 1}),
            Arguments.of(4, new int[]{4, 0, 1, -2}, new int[]{4, 5, -1, -1}),
            Arguments.of(3, new int[]{4, 0, 1}, new int[]{4, 5, 1}),
            Arguments.of(2, new int[]{4, 0}, new int[]{4, 4}),
            Arguments.of(1, new int[]{4}, new int[]{4}),
            Arguments.of(0, new int[]{}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldMutateArray(int length, int[] inputArray, int[] expectedArray) {
        final var resultingArray = new Mutator().mutate(length, inputArray);

        assertAll(
            () -> assertEquals(length, resultingArray.length),
            () -> assertArrayEquals(expectedArray, resultingArray)
        );
    }
}
