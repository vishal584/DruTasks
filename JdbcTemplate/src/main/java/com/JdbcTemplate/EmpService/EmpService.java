package com.JdbcTemplate.EmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JdbcTemplate.Bean.EmployeeRef;
import com.JdbcTemplate.Dao.EmpDao;


@Service
public class EmpService {

	@Autowired
	EmpDao empDao;
	
	public Boolean insertEmpDetail(EmployeeRef employeRef) {
		return empDao.insertEmpDetail(employeRef);
	}

}
