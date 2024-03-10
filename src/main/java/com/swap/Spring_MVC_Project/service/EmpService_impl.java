package com.swap.Spring_MVC_Project.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swap.Spring_MVC_Project.entity.Employee;
import com.swap.Spring_MVC_Project.repo.EmpRepo;

@Service
public class EmpService_impl implements EmpService {
	
	@Autowired
	private EmpRepo repo;

	@Override
	public Employee getEmployee(Employee employee) {
		Employee emp = repo.getEmployee(employee);
		return emp;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		String empid = new SimpleDateFormat("yyyyMMddHHmmsssss").format(new Date());
		employee.setEmpid(empid);
		Employee emp = repo.addEmployee(employee);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = repo.getAllEmployee();
		return list;
	}

	@Override
	public Employee getProfile(String username) {
		Employee emp = repo.getProfile(username);
		return emp;
	}

	@Override
	public boolean updateProfile(Employee employee) {
		boolean b = repo.updateProfile(employee);
		return b;
	}

	@Override
	public boolean deleteEmployee(String empid) {
		boolean b = repo.deleteEmployee(empid);
		return b;
	}

}
