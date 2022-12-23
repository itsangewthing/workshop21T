package com.demo.workshop21T.models;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Customers {
    private Integer id;
    private String company;
    private String last_name;
    private String first_name;
    private String email_address;
    private String job_title;
    private Long business_phone;
    private Long home_phone;
    private Integer mobile_phone;
    private Integer fax_number;
    private String address;
    private String city;
    private String state_province;
    private Integer zip_postal_code;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail_address() {
        return this.email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getJob_title() {
        return this.job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Long getBusiness_phone() {
        return this.business_phone;
    }

    public void setBusiness_phone(Long business_phone) {
        this.business_phone = business_phone;
    }

    public Long getHome_phone() {
        return this.home_phone;
    }

    public void setHome_phone(Long home_phone) {
        this.home_phone = home_phone;
    }

    public Integer getMobile_phone() {
        return this.mobile_phone;
    }

    public void setMobile_phone(Integer mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public Integer getFax_number() {
        return this.fax_number;
    }

    public void setFax_number(Integer fax_number) {
        this.fax_number = fax_number;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_province() {
        return this.state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public Integer getZip_postal_code() {
        return this.zip_postal_code;
    }

    public void setZip_postal_code(Integer zip_postal_code) {
        this.zip_postal_code = zip_postal_code;
    }

//from CustomerRepository.java, this method allows to search for customers 
// SELECT_ALL_CUSTOMERS and add it to the list created.
    public static Customers create(SqlRowSet rs) {
//instantiate customers
        Customers c = new Customers();
        
//insert attributes from Customers when it is being added to the Customers list. 
        c.setId(rs.getInt("id"));
        c.setCompany(rs.getString("company"));
        c.setLast_name(rs.getString("last_name"));
        c.setFirst_name(rs.getNString("first_name"));
        c.setJob_title(rs.getNString("job_title"));
        c.setCity(rs.getNString("city"));
        return c;
    }

    public static Object populate(SqlRowSet rs) {
        return rs;
    }

}