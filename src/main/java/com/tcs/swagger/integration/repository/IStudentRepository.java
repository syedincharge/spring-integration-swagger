package com.tcs.swagger.integration.repository;


import com.tcs.swagger.integration.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
