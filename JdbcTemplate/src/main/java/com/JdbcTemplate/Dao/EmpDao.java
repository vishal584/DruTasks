package com.JdbcTemplate.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.JdbcTemplate.Bean.EmployeeRef;

public class EmpDao {

	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	public Boolean insertEmpDetail(EmployeeRef employeRef) {
		boolean flag=false;
		
		String query="insert into employee (emp_id,emp_name,emp_dept)values(?,?,?)";
		flag=jdbcTemplate.update(query)>0;;
		
		return flag;
	}

}
