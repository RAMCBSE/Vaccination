package com.cbse.it.Vaccination.service;

import java.util.List;

import com.cbse.it.Vaccination.entity.Student;

public interface StudentService {
  List<Student> getStudents();
  
  Student SaveStudent( Student student);
}
