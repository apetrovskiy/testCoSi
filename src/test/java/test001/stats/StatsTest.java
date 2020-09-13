package test001.stats;

import org.junit.jupiter.api.Test;
import test001.versions.CsvProcessor;

public class StatsTest {
    @Test
    void shouldReadCsvFile() {
        final var inputFilePath = "C:\\Projects\\Java\\CodeSignTest\\src\\main\\resources\\data.csv";
        // final var

        final var actualResult = new CsvProcessor().processCsvFile(inputFilePath);

        System.out.println("===================================================");
        System.out.println(actualResult);

    }
}
