package mutateArr;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static org.junit.jupiter.params.provider.Arguments.of;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Tags({@Tag("tag Java")})
@Epic("epic Tasks")
@Feature("feature Various tasks")
@Story("story Test mutatorr")
@DisplayName("suite Java")
@TestInstance(PER_CLASS)
@SuppressWarnings("PMD")
public class TestMutator {
    static Stream getInputData() {
        return Stream.of(
                of(5, new int[] {4, 0, 1, -2, 3}, new int[] {4, 5, -1, 2, 1}),
                of(4, new int[] {4, 0, 1, -2}, new int[] {4, 5, -1, -1}),
                of(3, new int[] {4, 0, 1}, new int[] {4, 5, 1}),
                of(2, new int[] {4, 0}, new int[] {4, 4}),
                of(1, new int[] {4}, new int[] {4}),
                of(0, new int[] {}, new int[] {}));
    }

    @ParameterizedTest
    @MethodSource("getInputData")
    @DisplayName("test Mutate array")
    void shouldMutateArray(int length, int[] inputArray, int[] expectedArray) {
        final var resultingArray = new Mutator().mutate(length, inputArray);

        assertAll(
                () -> assertEquals(length, resultingArray.length),
                () -> assertArrayEquals(expectedArray, resultingArray));
    }
}
