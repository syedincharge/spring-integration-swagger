package com.tcs.swagger.integration.util;


import com.tcs.swagger.integration.model.Student;

public interface StudentUtil {

    public static void mapNotNullValues(Student source, Student student) {
        if(student!=null ) {

            if(student.getStdCourse()!=null) source.setStdCourse(student.getStdCourse());
            if(student.getStdFee()!=null) source.setStdFee(student.getStdFee());
            if(student.getStdName()!=null) source.setStdName(student.getStdName());
        }
    }

}

