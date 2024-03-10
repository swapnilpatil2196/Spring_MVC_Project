package com.swap.Spring_MVC_Project.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.swap.Spring_MVC_Project.entity.Employee;
import com.swap.Spring_MVC_Project.service.EmpService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmpService service;
	
	@RequestMapping(value="/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value="/addEmployeePage")
	public String addEmployeePage() {
		return "addEmployee";
	}

	@PostMapping(value="/getEmployee")
	public ModelAndView getEmployee(@ModelAttribute Employee employee, HttpSession session) {
		
		Employee emp = service.getEmployee(employee);
		session.setAttribute("uName", emp.getUsername());
		session.setAttribute("type", emp.getType());
		
		if(emp!=null) {
			return new ModelAndView("home");
		}
		else {
			return new ModelAndView("index", "msg", "Invalid credintials !!!!!!");
		}
	}
	
	@PostMapping(value="/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee employee) {
		
		Employee emp = service.addEmployee(employee);

		if(emp!=null) {
			return new ModelAndView("home", "msg", "Employee Added Successfully");
		}
		else {
			return new ModelAndView("index", "msg", "Employee not Added");
		}
	}
	
	@GetMapping(value="/listofEmployee")
	public ModelAndView getAllEmployee(@RequestParam String msg1, Model model) {
		List<Employee> list = service.getAllEmployee();
		if(!msg1.equals("null")) {
		model.addAttribute("msg1", msg1);
		}
		return new ModelAndView("listofEmployee", "employees", list);	
	}
	
	@GetMapping(value="/profile")
	public ModelAndView getProfile(@RequestParam String un) {
		Employee emp = service.getProfile(un);
		return new ModelAndView("profile", "emp", emp);
	}
	
	@PostMapping(value="/updateEmployee")
	public ModelAndView updateProfile(@ModelAttribute Employee employee, Model model) {
		boolean b = service.updateProfile(employee);
		if(b) {
	    model.addAttribute("msg", "Profile updated successfully");
	    model.addAttribute("emp", employee);
		return new ModelAndView("profile");
		}
		else {
		    model.addAttribute("msg", "Profile not updated");
		    model.addAttribute("emp", employee);
			return new ModelAndView("profile");
		}
	}
	
	@GetMapping(value="/deleteEmp")
	public String deleteEmployee(@RequestParam String empid) {
		boolean b = service.deleteEmployee(empid);
		if(b) {
		return "redirect:/listofEmployee?msg1=Deleted";	
		}
		else {
			return "redirect:/listofEmployee?msg1=Not Deleted";
		}
	}
	
	
	
	
}
