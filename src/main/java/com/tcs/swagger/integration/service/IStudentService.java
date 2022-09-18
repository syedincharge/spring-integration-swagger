package com.tcs.swagger.integration.service;


import com.tcs.swagger.integration.model.Student;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student s);
    public Student getStudentById(Integer id);
    public List<Student> getAllStudents();
    public void deleteStudentById(Integer id);
    public boolean studentExist(Integer id);
}
