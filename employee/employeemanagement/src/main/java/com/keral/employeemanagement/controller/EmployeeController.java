package com.keral.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.keral.employeemanagement.entity.Employee;
import com.keral.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("/")
	public ModelAndView employeeName() {

		ModelAndView mv = new ModelAndView("employee.jsp");
		// mv.setViewName("employee");
		return mv;
	}

	@RequestMapping("/employees")
	public ModelAndView addEmployee(Employee employee) {

		ModelAndView mv = new ModelAndView("employeesResult.jsp");
		service.saveEmployee(employee);
		return mv;
	}

	@GetMapping("/emp")
	public List<Employee> getAllEmployees() {

		return service.getAllEmployees();

	}

	@GetMapping("/emp/{eId}")
	public Employee getEmployeeById(@PathVariable("eId") int eId) throws Exception {

		return service.getEmployeeById(eId);
	}

}
