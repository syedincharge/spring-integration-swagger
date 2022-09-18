package com.tcs.swagger.integration.service;


import com.tcs.swagger.integration.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public Employee saveEmployee(Employee s);
    public Employee getEmployeeById(Integer id);
    public List<Employee> getAllEmployees();
    public void deleteEmployeeById(Integer id);
    public boolean EmployeeExist(Integer id);
}
