package com.cbse.it.Vaccination.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cbse.it.Vaccination.entity.Student;
import com.cbse.it.Vaccination.service.StudentService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class StudentController {
	
	private StudentService studentService;
	
	
	public StudentController (StudentService studentService)
	{
		super();
		this.studentService=studentService;
	}
	@GetMapping("/students")
     public ModelAndView students( )
     
     {
		ModelAndView model =new ModelAndView();
    	model.addObject("students",studentService.getStudents()) ;
    	model.setViewName("students");
    	
    	return model;
     }
	@GetMapping("students/new")
	public String CreateStudent( Model model) {
		
		Student student=new Student();
		
		model.addAttribute("student",student);
				
		return "create_student";
	}
	@PostMapping("/students")
	public String AddStudent(@ModelAttribute("student") Student student)	
	
	{
		studentService.SaveStudent(student);
		return "redirect:students";
	}
}
