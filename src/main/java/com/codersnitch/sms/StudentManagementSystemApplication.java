package com.codersnitch.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codersnitch.sms.entity.Student;
import com.codersnitch.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	//@Autowired
	//private StudentRepository studentRepository;
		
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Efe","Akil","snitch@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Isinsu","Celebioglu","shinsu@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Onur","Güven","dopest06@gmail.com");
//		studentRepository.save(student3);
		
	}

}
