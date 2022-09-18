package com.tcs.swagger.integration.service.impl;



import java.util.List;

import com.tcs.swagger.integration.model.Employee;
import com.tcs.swagger.integration.repository.IEmployeeRepository;
import com.tcs.swagger.integration.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;



@Service
@EnableTransactionManagement
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeRepository repo;

    @Override
    @Transactional
    public Employee saveEmployee(Employee e) {
        Employee emp=repo.save(e);
        return emp;
    }

    @Override
    @Transactional(readOnly=true)
    public Employee getEmployeeById(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    @Transactional(readOnly=true)
    public List<Employee> getAllEmployees() {
        List<Employee> elist=repo.findAll();
        if(elist!=null && !elist.isEmpty()) {
            return elist;
        }
        else {
            return null;
        }
    }

    @Override
    @Transactional
    public void deleteEmployeeById(Integer id) {
        repo.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public boolean EmployeeExist(Integer id) {
        // TODO Auto-generated method stub
        return repo.existsById(id);
    }

}
