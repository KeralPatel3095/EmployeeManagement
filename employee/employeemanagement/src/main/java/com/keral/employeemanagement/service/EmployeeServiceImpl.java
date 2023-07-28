package com.keral.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keral.employeemanagement.entity.Employee;
import com.keral.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> emp = new ArrayList<Employee>();
		emprepo.findAll();
		return emp;
	}

	@Override
	public void saveEmployee(Employee employee) {

		emprepo.save(employee);

	}

	@Override
	public Employee getEmployeeById(Integer eId)
	{

		Employee emp = emprepo.findById(eId).get();

		try {

			if (emp.geteId() < 200) {
				System.out.println("Please check id");
			}
		} catch (Exception e) {
			System.out.println("eID should be less than 200 as we have 200 employees only");
		}

		return emp;
	}

	@Override
	public void deleteEmployeeById(Integer eId) {

		emprepo.deleteById(eId);
	}

}
