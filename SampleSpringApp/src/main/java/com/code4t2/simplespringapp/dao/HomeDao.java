package com.code4t2.simplespringapp.dao;

import java.util.List;

import com.code4t2.simplespringapp.model.Customer;

public interface HomeDao {

	List<Customer> getCustomers();
}