package com.tdsi.gestionstudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tdsi.gestionstudent.model.Student;
import com.tdsi.gestionstudent.repository.StudentRepository;

@SpringBootApplication
public class GestionstudentApplication implements CommandLineRunner{
	
	@Autowired
    private StudentRepository studentRepo;
	public static void main(String[] args) {
		SpringApplication.run(GestionstudentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student std1 = new Student("Diegane", "Faye", "diegane@gmail.com");
//		studentRepo.save(std1);
//		Student std2 = new Student("Barth", "Diaz", "diegane@gmail.com");
//		studentRepo.save(std2);
		
	}

}
