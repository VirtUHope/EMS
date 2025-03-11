package com.emp.manage.services;

import java.lang.System.Logger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.manage.entities.Employee;
import com.emp.manage.repository.DepartmentRepository;
import com.emp.manage.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// fetching all employees
	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll(); 
		return emps;
	}
	
	// fetching employee by id
	public Optional<Employee> getEmployee(int id){
		return employeeRepository.findById(id);
	}
	
	// inserting employee
	public Employee addEmployee(Employee e) {
		try {
			employeeRepository.save(e);
			return e;
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return null;
	}
	
	// updating employee by id
	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
	
	// deleting all employees
	public void deleteAllEmployees(){
		employeeRepository.deleteAll();
	}
	
	// deleting employee by id
	public void deleteEmployeeByID(int id){
		employeeRepository.deleteById(id);
	}
	
	//patching/updating employee by id
	public void patchEmployee(Employee emp, int id) {
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
}

