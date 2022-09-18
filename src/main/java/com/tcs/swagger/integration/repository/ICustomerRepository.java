package com.tcs.swagger.integration.repository;


import com.tcs.swagger.integration.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
