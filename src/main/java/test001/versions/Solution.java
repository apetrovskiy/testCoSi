package test001.versions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

class Solution {
    private static final String LINE_END = "\n";
    private static final String TOTAL_CUSTOMERS = "Total customers:" + LINE_END;
    private static final String CUSTOMERS_BY_CITY = "Customers by city:" + LINE_END;
    private static final BiFunction<String, Long, String> CITY_TEMPLATE = (city, number) -> String.format("%s: %s" + LINE_END, city, number);
    private static final String CUSTOMERS_BY_COUNTRY = "Customers by country:" + LINE_END;
    private static final String COUNTRY_WITH_LARGEST = "Country with the largest number of customers' contracts:" + LINE_END;
    private static final String UNIQUE_CITIES = "Unique cities with at least one customer:" + LINE_END;

    public static void main(String[] args) {
        System.out.println("Hello, World");
        final var inputFilePath = "C:\\Projects\\Java\\CodeSignTest\\src\\main\\resources\\data.csv";
        final var actualResult = new Solution.CsvProcessor().processCsvFile(inputFilePath);

    }

    public static class DataEntry {
        @JsonProperty("ID")
        private String id;
        @JsonProperty("NAME")
        private String name;
        @JsonProperty("CITY")
        private String city;
        @JsonProperty("COUNTRY")
        private String country;
        @JsonProperty("CPERSON")
        private String contactPerson;
        @JsonProperty("EMPLCNT")
        private int employeeCount;
        @JsonProperty("CONTRCNT")
        private int contractCount;
        @JsonProperty("CONTRCOST")
        private double contractCost;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getContactPerson() {
            return contactPerson;
        }

        public void setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
        }

        public int getEmployeeCount() {
            return employeeCount;
        }

        public void setEmployeeCount(int employeeCount) {
            this.employeeCount = employeeCount;
        }

        public int getContractCount() {
            return contractCount;
        }

        public void setContractCount(int contractCount) {
            this.contractCount = contractCount;
        }

        public double getContractCost() {
            return contractCost;
        }

        public void setContractCost(double contractCost) {
            this.contractCost = contractCost;
        }
    }
    public static class Report {
        private int totalCustomers;
        private Map<String, Long> customersByCity;
        private Map<String, Integer> customersByCountry;
        private Map<String, Integer> topContractNumberByCountry;
        private int uniqueCitiesForTop;

        public int getTotalCustomers() {
            return totalCustomers;
        }

        public void setTotalCustomers(int totalCustomers) {
            this.totalCustomers = totalCustomers;
        }

        public Map<String, Long> getCustomersByCity() {
            return customersByCity;
        }

        public void setCustomersByCity(Map<String, Long> customersByCity) {
            this.customersByCity = customersByCity;
        }

        public Map<String, Integer> getCustomersByCountry() {
            return customersByCountry;
        }

        public void setCustomersByCountry(Map<String, Integer> customersByCountry) {
            this.customersByCountry = customersByCountry;
        }

        public Map<String, Integer> getTopContractNumberByCountry() {
            return topContractNumberByCountry;
        }

        public void setTopContractNumberByCountry(Map<String, Integer> topContractNumberByCountry) {
            this.topContractNumberByCountry = topContractNumberByCountry;
        }

        public int getUniqueCitiesForTop() {
            return uniqueCitiesForTop;
        }

        public void setUniqueCitiesForTop(int uniqueCitiesForTop) {
            this.uniqueCitiesForTop = uniqueCitiesForTop;
        }
    }
    public static class CsvProcessor {


        public String processCsvFile(String csvFilePath) {
            final var dataEntryCollection = readCsvFile(csvFilePath);
            final var report = convertDataCollectionIntoReport(dataEntryCollection);

            System.out.println(buildTextualReport(report));

            return buildTextualReport(report);
        }

        private List<Solution.DataEntry> readCsvFile(String csvFilePath) {
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema schema = CsvSchema.emptySchema().withHeader();

            ObjectReader oReader = csvMapper.reader(Solution.DataEntry.class).with(schema);
            var resultCollection = new ArrayList<Solution.DataEntry>();
            try (Reader reader = new FileReader(csvFilePath)) {
                MappingIterator<Solution.DataEntry> mi = oReader.readValues(reader);
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

        private Solution.Report convertDataCollectionIntoReport(List<Solution.DataEntry> dataCollection) {
            var result = new Solution.Report();

            if (null == dataCollection || 0 == dataCollection.size())
                return result;

            result.setTotalCustomers(dataCollection.size());
            result.setCustomersByCity(dataCollection.stream()
                            .collect(Collectors.groupingBy((Solution.DataEntry item) -> item.getCity(), Collectors.counting()))
//                .entrySet()
//                .stream().sorted()
//                .collect(Collectors.toMap(item -> item.getKey(), item -> item.getValue()))
            );

            return result;
        }

        private String buildTextualReport(Solution.Report report) {
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
}
