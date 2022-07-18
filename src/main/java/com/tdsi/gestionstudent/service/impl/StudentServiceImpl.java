package com.tdsi.gestionstudent.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdsi.gestionstudent.model.Student;
import com.tdsi.gestionstudent.repository.StudentRepository;
import com.tdsi.gestionstudent.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}
	@Override
	public Student detailStudent(Long id) {
		
		return studentRepository.findById(id).get();
	}
	
	

}
