package com.example.emp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String firstName;
		private String lastName;
		private String emailId;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(long id, String firstName, String lastName, String emailId) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
					+ "]";
		}
		public Employee findById(long id2) {
			// TODO Auto-generated method stub
			return null;
		}
		public Employee save(Employee employee) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	
}
