package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.JdbcDao;
import model.Employee;

@Service
public class JdbcService {
	
	@Autowired
	JdbcDao jdbcDao;
	
	public Boolean insertEmpDetail(Employee employee) {
		return jdbcDao.insertEmpDetail(employee);
	}

}
