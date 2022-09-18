package com.tcs.swagger.integration.service.impl;

import java.util.List;

import com.tcs.swagger.integration.model.Customer;
import com.tcs.swagger.integration.repository.ICustomerRepository;
import com.tcs.swagger.integration.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;

@Service
@EnableTransactionManagement
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository repo;

    @Override
    @Transactional
    public Customer saveCustomer(Customer c) {
        Customer custm=repo.save(c);
        return custm;
    }

    @Override
    @Transactional(readOnly=true)
    public Customer getCustomerById(Integer id) {

        Customer cust=repo.findById(id).get();

        return cust;
    }

    @Override
    @Transactional(readOnly=true)
    public List<Customer> getAllCustomers() {
        List<Customer> clist=repo.findAll();
        if(clist!=null && !clist.isEmpty()) {
            return clist;
        }
        else {
            return null;
        }
    }

    @Override
    @Transactional
    public void deleteCustomerById(Integer id) {
        repo.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public boolean CustomerExist(Integer id) {
        return repo.existsById(id);
    }

}
