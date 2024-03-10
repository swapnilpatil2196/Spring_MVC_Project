package com.swap.Spring_MVC_Project.repo;

import java.util.List;

import com.swap.Spring_MVC_Project.entity.Employee;

public interface EmpRepo {
	
	public Employee getEmployee(Employee employee);

	public Employee addEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee getProfile(String username);
	
	public boolean updateProfile(Employee employee);

	public boolean deleteEmployee(String empid);





}
