package com.emp.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.emp.manage.entities.Employee;


//you can also add CrudRepository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
