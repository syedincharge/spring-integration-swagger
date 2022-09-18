package com.tcs.swagger.integration.repository;


import com.tcs.swagger.integration.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}