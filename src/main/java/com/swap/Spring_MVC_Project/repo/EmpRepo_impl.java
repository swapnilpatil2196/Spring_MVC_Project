package com.swap.Spring_MVC_Project.repo;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.swap.Spring_MVC_Project.entity.Employee;

@Repository
public class EmpRepo_impl implements EmpRepo {
	
	@Autowired
	SessionFactory factory;

	@Override
	public Employee getEmployee(Employee employee) {
		Employee emp=null;
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Criterion username = Restrictions.eq("username", employee.getUsername());
		Criterion password = Restrictions.eq("password", employee.getPassword());
		criteria.add(Restrictions.and(username, password));
		List<Employee> list = criteria.list();
		if(list!=null) {
			emp = list.get(0);
		}
		return emp;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String empid =  (String) session.save(employee);
		transaction.commit();
		Employee emp = session.get(Employee.class, empid);
		session.close();
		if(emp!=null) {
			return emp;
		}
		else {
			return null; 
		}	
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		return list;
	}

	@Override
	public Employee getProfile(String username) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("username", username));
		List<Employee> list = criteria.list();
		Employee emp = list.get(0);
		return emp;
	}

	@Override
	public boolean updateProfile(Employee employee) {
		boolean b = false;
		Session session = factory.openSession();
		Transaction tt = session.beginTransaction();
		session.update(employee);
		tt.commit();
		b=true;
		session.close();
		return b;
	}

	@Override
	public boolean deleteEmployee(String empid) {
		boolean b = false;
	    Employee employee = new Employee();
		Session session = factory.openSession();
		Transaction tt = session.beginTransaction();
	    employee.setEmpid(empid);
		session.delete(employee);
		tt.commit();
		b=true;
		session.close();
		return b;
	}
	
}
