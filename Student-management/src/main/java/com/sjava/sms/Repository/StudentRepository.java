package com.sjava.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjava.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
