package com.keral.employeemanagement.service;

import java.util.List;

import com.keral.employeemanagement.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(Integer id) throws Exception;

	void deleteEmployeeById(Integer id);

}
