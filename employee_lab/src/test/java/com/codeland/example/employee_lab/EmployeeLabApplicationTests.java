package com.codeland.example.employee_lab;

import com.codeland.example.employee_lab.employee.Employee;
import com.codeland.example.employee_lab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeLabApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createSingleEmployee(){
		Employee employee = new Employee("John", 1,89898, "john@email.com" );
		employeeRepository.save(employee);
	}

}
