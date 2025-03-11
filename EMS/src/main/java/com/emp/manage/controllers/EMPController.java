package com.emp.manage.controllers;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.manage.entities.Employee;
import com.emp.manage.services.EmployeeService;

@RestController
public class EMPController {

	static final Logger logger  = LogManager.getLogger(EMPController.class.getName());

	@Autowired
	private EmployeeService employeeService;
	
	// displaying list of all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees();
	}

	// displaying employee by id
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return employeeService.getEmployee(id);
	}
	
	// inserting employee
	@PostMapping("/employees")
	public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee){
		Employee emp = employeeService.addEmployee(employee);
		if(emp != null) {
			return ResponseEntity.ok(emp);
		}else {
			return ResponseEntity.badRequest().body(null);
		}
	}

	//updating employee by id
	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee e, @PathVariable int id){
		employeeService.updateEmployee(e, id);
	}
	
	// deleting all employees
	@DeleteMapping("/employees")
	public void deleteAllEmployees(){
		employeeService.deleteAllEmployees();
	}

	// deleting employee by id
	@DeleteMapping("employees/{id}")
	public void deleteEmployeeByID(@RequestBody Employee e, @PathVariable int id){
		employeeService.deleteEmployeeByID(id);
	}

	// updating/ patching employee by id
	@PatchMapping("employees/{id}")
	public void patchEmployeeByID(@RequestBody Employee e, @PathVariable int id) {
		employeeService.patchEmployee(e, id);
	}
}
