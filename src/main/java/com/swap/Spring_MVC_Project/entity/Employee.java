package com.swap.Spring_MVC_Project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String empid;
	private String username;
	private String password;
	private String department;
	private String salary;
	private String type;
	private String status;
	private String question;
	private String answer;
	
	public Employee() {
		super();
	}

	public Employee(String empid, String username, String password, String department, String salary, String type,
			String status, String question, String answer) {
		super();
		this.empid = empid;
		this.username = username;
		this.password = password;
		this.department = department;
		this.salary = salary;
		this.type = type;
		this.status = status;
		this.question = question;
		this.answer = answer;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", username=" + username + ", password=" + password + ", department="
				+ department + ", salary=" + salary + ", type=" + type + ", status=" + status + ", question=" + question
				+ ", answer=" + answer + "]";
	}


}
