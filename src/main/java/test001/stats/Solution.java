package test001.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.*;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

class Solution {
    private static final String LINE_END = "\n";
    private static final String TOTAL_CUSTOMERS = "Total customers:" + LINE_END;
    private static final String CUSTOMERS_BY_CITY = "Customers by city:" + LINE_END;
    private static final BiFunction<String, Integer, String> CITY_TEMPLATE = (city, number) -> String.format("%s: %s" + LINE_END, city, number);
    private static final String CUSTOMERS_BY_COUNTRY = "Customers by country:" + LINE_END;
    private static final BiFunction<String, Integer, String> COUNTRY_TEMPLATE = (country, number) -> String.format("%s: %s" + LINE_END, country, number);
    private static final String COUNTRY_WITH_LARGEST = "Country with the largest number of customers' contracts:" + LINE_END;
    private static final BiFunction<String, Integer, String> COUNTRY_TOP_TEMPLATE = (country, number) -> String.format("%s (%s contracts)" + LINE_END, country, number);
    private static final String UNIQUE_CITIES = "Unique cities with at least one customer:" + LINE_END;

    public static void main(String[] args) {
//        final var inputFilePath = "C:\\Projects\\Java\\CodeSignTest\\src\\main\\resources\\data.csv";
        final var inputFilePath = "/root/customers/dat/a.csv";
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
        private Map<String, Integer> customersByCity;
        private Map<String, Integer> customersByCountry;
        private Map.Entry<String, Integer> topContractNumberByCountry;
        private Long uniqueCitiesForTop;

        public int getTotalCustomers() {
            return totalCustomers;
        }

        public void setTotalCustomers(int totalCustomers) {
            this.totalCustomers = totalCustomers;
        }

        public Map<String, Integer> getCustomersByCity() {
            return customersByCity;
        }

        public void setCustomersByCity(Map<String, Integer> customersByCity) {
            this.customersByCity = customersByCity;
        }

        public Map<String, Integer> getCustomersByCountry() {
            return customersByCountry;
        }

        public void setCustomersByCountry(Map<String, Integer> customersByCountry) {
            this.customersByCountry = customersByCountry;
        }

        public Map.Entry<String, Integer> getTopContractNumberByCountry() {
            return topContractNumberByCountry;
        }

        public void setTopContractNumberByCountry(Map.Entry<String, Integer> topContractNumberByCountry) {
            this.topContractNumberByCountry = topContractNumberByCountry;
        }

        public Long getUniqueCitiesForTop() {
            return uniqueCitiesForTop;
        }

        public void setUniqueCitiesForTop(Long uniqueCitiesForTop) {
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
            var resultCollection = new ArrayList<Solution.DataEntry>();

            try (var fileReader = new FileReader(csvFilePath)) {
                var bufferedReader = new BufferedReader(fileReader);
                var stringBuffer = new StringBuffer();
                String line;
                bufferedReader.readLine();
                while ((line = bufferedReader.readLine()) != null) {
                    final var dataEntry = new Solution.DataEntry();
                    dataEntry.setId(getFirstSection(line));
                    line = getStringAfterTheFirstComma(line);
                    dataEntry.setName(getFirstSection(line));
                    line = getStringAfterTheFirstComma(line);
                    dataEntry.setCity(getFirstSection(line));
                    line = getStringAfterTheFirstComma(line);
                    dataEntry.setCountry(getFirstSection(line));
                    line = getStringAfterTheFirstComma(line);
                    dataEntry.setContactPerson(getFirstSection(line));
                    line = getStringAfterTheFirstComma(line);
                    dataEntry.setEmployeeCount(Integer.valueOf(getFirstSection(line)));
                    line = getStringAfterTheFirstComma(line);
                    dataEntry.setContractCount(Integer.valueOf(getFirstSection(line)));
                    line = getStringAfterTheFirstComma(line);
                    dataEntry.setContractCost(Double.valueOf(getFirstSection(line)));

                    resultCollection.add(dataEntry);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return resultCollection;
        }

        private String getFirstSection(String line) {
            return line.contains(",")
                    ? line.substring(0, line.indexOf(","))
                    : line;
        }

        private String getStringAfterTheFirstComma(String line) {
            return null != line && "" != line && line.contains(",")
                    ? line.substring(line.indexOf(',') + 1)
                    : "";
        }

        private Solution.Report convertDataCollectionIntoReport(List<Solution.DataEntry> dataCollection) {
            var result = new Solution.Report();

            if (null == dataCollection || 0 == dataCollection.size())
                return result;

            result.setTotalCustomers(dataCollection.size());
            result.setCustomersByCity(dataCollection.stream()
                            .collect(Collectors.groupingBy((Solution.DataEntry item) -> item.getCity(),
                                    Collectors.summingInt(item -> 1)))
                    .entrySet()
                    .stream()
                            .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new))
            );
            result.setCustomersByCountry(dataCollection.stream()
                    .sorted(Comparator.comparing((Solution.DataEntry item) -> item.getCountry()))
                    .collect(Collectors.groupingBy((Solution.DataEntry item) -> item.getCountry(),
                            Collectors.summingInt(item -> 1)))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new))
            );

            result.setTopContractNumberByCountry(
                    dataCollection.stream()
                            .collect(Collectors.groupingBy((Solution.DataEntry item) -> item.getCountry(), Collectors.summingInt(i -> i.getContractCount())))
                    .entrySet()
                    .stream()
                            .max(
                                    (Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) -> e1.getValue()
                                    .compareTo(e2.getValue())
                            )
                            .get()
            );

            result.setUniqueCitiesForTop(
                    dataCollection.stream()
                    .filter(item -> 0 < item.getEmployeeCount())
                    .map(item -> item.getCity())
                    .distinct()
                    .count()
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
                    .stream()
                    .map(item -> CITY_TEMPLATE.apply(item.getKey(), item.getValue()))
                    .collect(Collectors.joining());

            result += CUSTOMERS_BY_COUNTRY;
            result += report.getCustomersByCountry()
                    .entrySet()
                    .stream()
                    .map(item -> COUNTRY_TEMPLATE.apply(item.getKey(), item.getValue()))
                    .collect(Collectors.joining());

            result += COUNTRY_WITH_LARGEST;
            result += COUNTRY_TOP_TEMPLATE.apply(report.getTopContractNumberByCountry().getKey(), report.getTopContractNumberByCountry().getValue());

            result += UNIQUE_CITIES;
            result += report.getUniqueCitiesForTop();
            result += LINE_END;

            return result;
        }
    }
}
