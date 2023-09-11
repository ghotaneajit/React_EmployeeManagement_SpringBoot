package com.example.emp.empRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.emp.entity.Employee;

public interface EmployeRepo extends JpaRepository<Employee, Long> {

}
