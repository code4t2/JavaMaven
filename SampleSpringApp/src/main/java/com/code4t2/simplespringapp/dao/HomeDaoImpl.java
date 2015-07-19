package com.code4t2.simplespringapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.code4t2.simplespringapp.model.Customer;

@Repository
public class HomeDaoImpl implements HomeDao {

	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @param dataSourceVariableName the dataSourceVariableName to set
	 */
	public void setDataSourceVariableName(DataSource dataSourceVariableName) {
		this.jdbcTemplate = new JdbcTemplate(dataSourceVariableName);
	}

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = this.jdbcTemplate.query("SELECT TOP 20 CustomerId, ContactName, CompanyName FROM CUSTOMERS", 
				new RowMapper<Customer>() {

					@Override
					public Customer mapRow(ResultSet rs, int rowNumber) throws SQLException {
						Customer customer = new Customer();
						customer.setCustomerId(rs.getString("CustomerId"));
						customer.setContactName(rs.getString("ContactName"));
						customer.setCompanyName(rs.getString("CompanyName"));
						return customer;
					} 
				
				});
		
		return customers;
	}
}