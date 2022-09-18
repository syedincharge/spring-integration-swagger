package com.tcs.swagger.integration.service;


import com.tcs.swagger.integration.model.Customer;

import java.util.List;

public interface ICustomerService {
    public Customer saveCustomer(Customer c);
    public Customer getCustomerById(Integer id);
    public List<Customer> getAllCustomers();
    public void deleteCustomerById(Integer id);
    public boolean CustomerExist(Integer id);
}
