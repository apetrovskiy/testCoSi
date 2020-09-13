package test001.versions;

import java.util.Map;

public class Report {
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
