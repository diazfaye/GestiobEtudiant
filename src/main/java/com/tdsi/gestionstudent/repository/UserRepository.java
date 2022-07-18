package com.tdsi.gestionstudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdsi.gestionstudent.model.User;
@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
 
}
