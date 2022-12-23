package com.demo.workshop21T.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.demo.workshop21T.models.Customers;
import com.demo.workshop21T.repository.CustomerRepository;

@Service
public class CustomersService {
    @Autowired
    private CustomerRepository custRepo;
    public Optional<Object> FindCustomersById (final Integer id){
        SqlRowSet rs = custRepo.getAllCustomers(id);
        if (rs.next()){
            return Optional.of(Customers.populate(rs));
        } else{
            return Optional.empty();
        }

    }
}
