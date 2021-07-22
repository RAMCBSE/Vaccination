package com.cbse.it.Vaccination.repositery;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cbse.it.Vaccination.entity.Student;

@Repository

public interface  StudentRepository extends JpaRepository<Student, Long> {

}
