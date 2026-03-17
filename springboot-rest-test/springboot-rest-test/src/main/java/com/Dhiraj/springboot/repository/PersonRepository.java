package com.Dhiraj.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Dhiraj.springboot.model.*;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
