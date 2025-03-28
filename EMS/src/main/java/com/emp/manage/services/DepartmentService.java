package com.emp.manage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.manage.entities.Department;
import com.emp.manage.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	

	// fetching all department
	public List<Department> getAllDepartments(){
		List<Department> depts = (List<Department>)departmentRepository.findAll(); 
		return depts;
	}
	
	// fetching department by id
	public Optional<Department> getDepartment(int id){
		return departmentRepository.findById(id);
	}
	
	// inserting department
	public void addDepartment(Department d) {
		departmentRepository.save(d);
	}
	
	// updating department by id
	public void updateDepartment(Department d, int id){
		if(id == d.getDepartment_ID()) {
			departmentRepository.save(d);
		}
	}
	
	// deleting all departments
	public void deleteAllDepartment(){
		departmentRepository.deleteAll();
	}
	
	// deleting department by id
	public void deleteDepartmentByID(int id){
		departmentRepository.deleteById(id);
	}
	
	//patching/updating department by id
	public void patchDepartment(Department d, int id) {
		if(id == d.getDepartment_ID()) {
			departmentRepository.save(d);
		}
	}
}
