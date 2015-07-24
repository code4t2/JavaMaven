package com.code4t2.simplespringapp.dao;

import java.util.List;

import com.code4t2.simplespringapp.model.Customer;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public interface HomeDao {

	List<Customer> getCustomers();
}