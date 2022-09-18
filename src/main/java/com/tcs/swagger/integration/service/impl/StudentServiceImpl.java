package com.tcs.swagger.integration.service.impl;




import java.util.List;

import com.tcs.swagger.integration.model.Student;
import com.tcs.swagger.integration.repository.IStudentRepository;
import com.tcs.swagger.integration.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


@Service
@EnableTransactionManagement
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository repo;

    @Override
    @Transactional
    public Student saveStudent(Student s) {
        Student sd=repo.save(s);
        return sd;
    }

    @Override
    @Transactional(readOnly=true)
    public Student getStudentById(Integer id) {

        return repo.findById(id).get();
    }

    @Override
    @Transactional(readOnly=true)
    public List<Student> getAllStudents() {
        List<Student> stdlist=repo.findAll();
        return stdlist;
    }

    @Override
    @Transactional
    public void deleteStudentById(Integer id) {
        repo.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public boolean studentExist(Integer id) {
        return repo.existsById(id);

    }

}