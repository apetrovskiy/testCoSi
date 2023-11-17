package firstDuplicate;

import static org.junit.jupiter.params.provider.Arguments.of;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Tags({@Tag("tag Java")})
@Epic("epic Tasks")
@Feature("feature Various tasks")
@Story("story First duplicate")
@DisplayName("suite Java")
class TestDuplicates {
    static Stream getInputData() {
        return Stream.of(
                of(new int[] {2, 1, 3, 5, 3, 2}, 3),
                of(new int[] {2, 2}, 2),
                of(new int[] {2, 4, 3, 5, 1}, -1),
                of(new int[] {1, 1, 2, 2, 1}, 1),
                of(
                        new int[] {
                            1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 11, 1, 2, 2,
                            11, 1, 2, 2, 11, 1, 2, 2, 1
                        },
                        1),
                of(getOneMillionOfIntegers(), 3),
                of(generateArrayOfSame(10000000), 1));
    }

    private static int[] getOneMillionOfIntegers() {
        return IntStream.range(0, 100).toArray();
    }

    private static int[] generateArrayOfSame(int length) {
        return IntStream.generate(() -> 1).limit(length).toArray();
    }

    @Disabled
    @ParameterizedTest
    @MethodSource("getInputData")
    @DisplayName("test return duplicate")
    void shouldReturnDuplicate(int[] input, int expectedResult) {
        final var cut = new Duplicates();

        Assertions.assertEquals(expectedResult, cut.findFirstValidDuplicate(input));
    }
}
