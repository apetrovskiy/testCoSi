package test001.stats;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class CsvProcessor {
    private static final String LINE_END = "\n";
    private static final String TOTAL_CUSTOMERS = "Total customers:" + LINE_END;
    private static final String CUSTOMERS_BY_CITY = "Customers by city:" + LINE_END;
    private static final BiFunction<String, Long, String> CITY_TEMPLATE = (city, number) -> String.format("%s: %s" + LINE_END, city, number);
    private static final String CUSTOMERS_BY_COUNTRY = "Customers by country:" + LINE_END;
    private static final String COUNTRY_WITH_LARGEST = "Country with the largest number of customers' contracts:" + LINE_END;
    private static final String UNIQUE_CITIES = "Unique cities with at least one customer:" + LINE_END;

    public String processCsvFile(String csvFilePath) {
        final var dataEntryCollection = readCsvFile(csvFilePath);
        final var report = convertDataCollectionIntoReport(dataEntryCollection);

//        System.out.println("============================= 1 =============================");
//        System.out.println(report.getTotalCustomers());
//        System.out.println("============================= 2 =============================");
//        report.getCustomersByCity()
//                .entrySet()
//                .forEach(entry -> System.out.println("city = " + entry.getKey() + ", number = " + entry.getValue()));

        System.out.println("============================= 3 =============================");
        System.out.println("============================= 4 =============================");
        System.out.println("============================= 5 =============================");
        System.out.println("============================= 6 =============================");
        System.out.println("============================= 7 =============================");

        return buildTextualReport(report);
    }

    private List<DataEntry> readCsvFile(String csvFilePath) {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        ObjectReader oReader = csvMapper.reader(DataEntry.class).with(schema);
        var resultCollection = new ArrayList<DataEntry>();
        try (Reader reader = new FileReader(csvFilePath)) {
            MappingIterator<DataEntry> mi = oReader.readValues(reader);
            while (mi.hasNext()) {
                // TODO: to delete
                final var dataEntry = mi.nextValue();
//                System.out.println(dataEntry.getCity());
                //
                resultCollection.add(dataEntry);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultCollection;
    }

    private Report convertDataCollectionIntoReport(List<DataEntry> dataCollection) {
        var result = new Report();

        if (null == dataCollection || 0 == dataCollection.size())
            return result;

        result.setTotalCustomers(dataCollection.size());
        result.setCustomersByCity(dataCollection.stream()
            .collect(Collectors.groupingBy((DataEntry item) -> item.getCity(), Collectors.counting()))
//                .entrySet()
//                .stream().sorted()
//                .collect(Collectors.toMap(item -> item.getKey(), item -> item.getValue()))
        );

        return result;
    }

    private String buildTextualReport(Report report) {
        var result = TOTAL_CUSTOMERS;
        result += report.getTotalCustomers();
        result += LINE_END;
        result += CUSTOMERS_BY_CITY;
        result += report.getCustomersByCity()
                .entrySet()
                .stream().sorted()
                .map(item -> CITY_TEMPLATE.apply(item.getKey(), item.getValue()));

        result += CUSTOMERS_BY_COUNTRY;


        result += COUNTRY_WITH_LARGEST;


        result += UNIQUE_CITIES;


        return result;
    }
    /*
Total customers:
7
Customers by city:
Chicago: 1
London: 2
Manchester: 1
San Francisco: 2
Sydney: 1
Customers by country:
Australia: 1
UK: 3
USA: 3
Country with the largest number of customers' contracts:
USA (25607 contracts)
Unique cities with at least one customer:
5
    */
}
