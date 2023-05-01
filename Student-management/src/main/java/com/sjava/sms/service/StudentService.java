package com.sjava.sms.service;
import java.util.List;

import com.sjava.sms.entity.Student;
public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentId(Long id);
    Student updateStudent(Student student);
    void deleteStudentId(Long id);
}
