package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.JdbcService;

@RestController
public class JdbcController {

	@Autowired
	JdbcService Service;
	
	@PostMapping("/insertEmp")
	public boolean insertEmpDetail(@RequestBody Employee employee ) {
		return  Service.insertEmpDetail(employee);
	}
}
