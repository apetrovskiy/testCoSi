package test001.versions;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CsvProcessor {
    public String processCsvFile(String csvFilePath) {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        ObjectReader oReader = csvMapper.reader(DataEntry.class).with(schema);
        try (Reader reader = new FileReader(csvFilePath)) {
            MappingIterator<DataEntry> mi = oReader.readValues(reader);
            while (mi.hasNext()) {
                final var dataEntry = mi.nextValue();
                System.out.println(dataEntry.getCity());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "";
    }
}
