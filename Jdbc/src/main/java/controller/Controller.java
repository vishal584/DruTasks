package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.JdbcService;


@RestController
public class Controller {

	@Autowired
	JdbcService Service;
	
	@PostMapping("/insertEmp")
	public void insertEmpDetail(@RequestBody Employee employee ) {
		 Service.insertEmpDetail(employee);
	}
}
