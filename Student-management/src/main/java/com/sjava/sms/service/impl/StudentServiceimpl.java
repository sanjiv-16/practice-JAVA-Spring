package com.sjava.sms.service.impl;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sjava.sms.Repository.StudentRepository;
import com.sjava.sms.entity.Student;
import com.sjava.sms.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService {
    private StudentRepository studentRepository; 
	
	public StudentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
	
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentId(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentId(Long id) {
		studentRepository.deleteById(id);	
	}
}
