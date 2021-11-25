package com.example.springbootthymeleaf.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootthymeleaf.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}