package com.tdsi.gestionstudent.service;


import java.util.List;

import com.tdsi.gestionstudent.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	void deleteStudentById(Long id);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
    Student detailStudent(Long id);
}
