package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.Employee;
@Repository
public class JdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	public Boolean insertEmpDetail(Employee employee) {
		boolean flag=false;
		
		String query="insert into employee (emp_id,emp_name,emp_dept)values(?,?,?)";
		flag=jdbcTemplate.update(query)>0;;
		
		return flag;
	}
}
