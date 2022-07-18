package com.tdsi.gestionstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tdsi.gestionstudent.model.Student;
import com.tdsi.gestionstudent.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "student";
		
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")  Student student) {
		
		studentService.saveStudent(student) ;
		
		return "redirect:/students";
		
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/students/update/{id}")
	public String updateStudentForm(@PathVariable Long id, Model model) {
		
		model.addAttribute("student", studentService.getStudentById(id));
		
		return "update_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
		
		Student existingStudent = studentService.getStudentById(id);
		
		existingStudent.setFirstName(student.getFirstName());
		
		existingStudent.setLastName(student.getLastName());
		
		existingStudent.setEmail(student.getEmail());
		
		studentService.updateStudent(existingStudent) ;
		
		return "redirect:/students";
		
	}
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable Long id, Student student) {
		
	    studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	
	@GetMapping("/students/detail/{id}")
	public String infoStudent(@PathVariable Long id, Model model) {
		
		model.addAttribute("students", studentService.detailStudent(id));
		
		return "detail_student";
	}

}
