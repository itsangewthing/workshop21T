package com.demo.workshop21T.repository;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.demo.workshop21T.models.Customers;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;


// 1 - insert annotation 
// 2 - autowire this file 
// 3 - insert jdbc template
@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

// 4 - TASK 3 - insert paramters that support HTTP endpoint:
    // @param Offset
    // @param limit
    // @return
    // -- create a method to get all customers

    public List<Customers> getAllCustomers(Integer offset, Integer limit){
        //prevent inheritence and instantiate a linkedlist to store data of list of customers
        final List<Customers> cust = new LinkedList<>();
       

        // 5 -- perform the query
        final SqlRowSet rs = jdbcTemplate.queryForRowSet(SQL_SELECT_ALL_CUSTOMERS, offset, limit);

        // create while loop -- enables search, when it fulfills the parameters and 
        // requirement, it'll add into the RS, and go to the next entry in line to check.

        while (rs.next()) {
            cust.add(Customers.create(rs));
        }
        


        return cust; 
    }
// //trying method 2
//     public List<Customers> getAllCustomers(final Integer limit, final Integer offset){
//         final List<Customers> result = new LinkedList<>();

    public SqlRowSet getAllCustomers(Integer id) {
        return null;
    }

//         final SqlRowSet rs = jdbcTemplate.queryForRowSet("SELECT * from customers limit ? offset ?", limit, offset);

//         // create while loop -- enables search, when it fulfills the parameters and 
//         // requirement, it'll add into the RS, and go to the next entry in line to check.

//         while (rs.next()) {
//             Customers c = new Customers();
//             c.setId(rs.getInt("id"));
//             c.setCompany(rs.getString("company"));
//             c.setLast_name(rs.getString("last_name"));
//             c.setFirst_name(rs.getString("first_name"));
//             c.setJob_title(rs.getString("job_title"));

//             result.add(c);
//         }
        


//         return (Collections.unmodifiableList(result));
//     }

}
