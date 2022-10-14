package com.JdbcTemplate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JdbcTemplate.Bean.EmployeeRef;
import com.JdbcTemplate.EmpService.EmpService;


@RestController
public class EmpController {

	@Autowired
	EmpService empService;
	
	@PostMapping("/insertEmp")
	public void insertEmpDetail(@RequestBody EmployeeRef employeRef ) {
		 empService.insertEmpDetail(employeRef);
	}
}
