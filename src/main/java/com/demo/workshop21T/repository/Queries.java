package com.demo.workshop21T.repository;


public class Queries {
    // QUERY 1 
    public static final String SQL_SELECT_ALL_CUSTOMERS = "select id, company, last_name, first_name, email_address, job_title, business_phone, home_phone, fax_number, address, city, state_province, zip_postal_code from customers limit ?, ? ";

}
