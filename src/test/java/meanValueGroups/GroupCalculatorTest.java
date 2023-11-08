package meanValueGroups;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import java.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@Epic("Training")
@Feature("Core")
@Story("Java")
@DisplayName("Java")
@Tag("Java")
@TestInstance(PER_CLASS)
@SuppressWarnings("PMD")
public class GroupCalculatorTest {
    @Disabled
    @Test
    @DisplayName("Mean groups")
    void shouldReturnMeanGroups() {
        final var inputArray = new int[][] {{3, 3, 4, 2}, {4, 4}, {4, 0, 3, 3}, {2, 3}, {3, 3, 3}};
        final var expectedResult = new int[][] {{0, 4}, {1}, {2, 3}};

        final var actualResult = new GroupCalculator().calculate(inputArray);

        Arrays.asList(actualResult).forEach(item -> System.out.println("first = " + item[0]));

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("just to show")
    void show() {
        // final var inputArray = new int[]{3,
        // 4,
        // 2,
        // 2,
        // 3};
        final var inputArray = new int[][] {{3, 3, 4, 2}, {4, 4}, {4, 0, 3, 3}, {2, 3}, {3, 3, 3}};

        final var actualResult = new GroupCalculator().calculate1(inputArray);
    }
}
