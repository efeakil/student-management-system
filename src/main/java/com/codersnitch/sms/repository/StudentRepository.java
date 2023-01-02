package com.codersnitch.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codersnitch.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
