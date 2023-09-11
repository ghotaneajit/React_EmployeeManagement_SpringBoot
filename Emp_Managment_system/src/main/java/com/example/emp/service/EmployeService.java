package com.example.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.emp.empRepo.EmployeRepo;
import com.example.emp.entity.Employee;
import com.example.emp.exception.ResourceNotFoundException;


@Service
public class EmployeService {

	
		@Autowired
		private EmployeRepo repo;
		
		
			public String save( Employee emp)
			{
				Employee save = repo.save(emp);
				return "saved";
			}
			
			
			public Optional<Employee> getEmp(long id)
			{
				return repo.findById(id);
			}
			
			public List<Employee> getAll()
			{
				 List<Employee> findAll = repo.findAll();
				 return findAll;
			}
			
			public String deleteEmp(long id)
			{
				repo.deleteById(id);
				return "Deleted";
				
			}
			
			public Employee updateEmp(long id ,Employee emp1 )
			{
				Employee employee = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
				employee.setFirstName(emp1.getFirstName());
				employee.setLastName(emp1.getLastName());
				employee.setEmailId(emp1.getEmailId());
				
				Employee updatedEmployee = repo.save(employee);
				return updatedEmployee;
			}
		
		
	
	
}
