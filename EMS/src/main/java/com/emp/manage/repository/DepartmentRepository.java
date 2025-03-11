package com.emp.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.emp.manage.entities.Department;

//you can also add CrudRepository
public interface DepartmentRepository  extends JpaRepository<Department, Integer>{

}
