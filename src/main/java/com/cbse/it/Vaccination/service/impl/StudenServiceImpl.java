package com.cbse.it.Vaccination.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cbse.it.Vaccination.entity.Student;
import com.cbse.it.Vaccination.repositery.StudentRepository;
import com.cbse.it.Vaccination.service.StudentService;
@Service
public class StudenServiceImpl implements StudentService {
	
	 private StudentRepository studentrepository;
   public StudenServiceImpl(StudentRepository studentrepository) {
	   super();
	   this.studentrepository=studentrepository;
	
}
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentrepository.findAll();
	}
	@Override
	public Student SaveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

}
