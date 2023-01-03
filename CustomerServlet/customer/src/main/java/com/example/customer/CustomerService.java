package com.example.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService(long id, Customer customer) {
        customers = new ArrayList<>();
        customers.add(new Customer());
        customers.add(new Customer());
    }

    public void updateCustomerByID() {

    }
}
