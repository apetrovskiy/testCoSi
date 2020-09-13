package test001.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataEntry {
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
