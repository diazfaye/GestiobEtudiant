package com.tdsi.gestionstudent.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdsi.gestionstudent.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
