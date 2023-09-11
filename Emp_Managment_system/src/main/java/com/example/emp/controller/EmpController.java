package com.example.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp.entity.Employee;
import com.example.emp.service.EmployeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/employees")
public class EmpController {
	
			@Autowired
			private EmployeService emp;
			
			@GetMapping("/emp/{id}")
			public Optional<Employee> getEmp(@PathVariable long id)
			{
				return emp.getEmp(id);
			}
			
			
			@PostMapping("/save")
			public String SaveEmp(@RequestBody Employee emp1) {
				emp.save(emp1);
				return "saved";
			}
			
			
			@GetMapping("/getAll")
			public List<Employee> getAllEmp(){
				List<Employee> ss = emp.getAll();
				return ss;
			}
			
			@DeleteMapping("/emp/{id}")
			public String deleteEmp(@PathVariable long id) {
				
				String deleteEmp = emp.deleteEmp(id);
				return "deleted";
			}
			
			@PutMapping("/emp/{id}")
			public Employee updateEmp(@PathVariable int id , @RequestBody Employee emp1)
			{
					
					Employee updateEmp = emp.updateEmp(id, emp1);
					return updateEmp;
			}
}


