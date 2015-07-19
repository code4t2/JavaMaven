package com.code4t2.simplespringapp.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.code4t2.simplespringapp.dao.HomeDao;
import com.code4t2.simplespringapp.model.Customer;

@Service
public class HomeBusinessImpl implements HomeBusiness {

	private HomeDao homeDaoVaribaleName;
	
	/**
	 * @param homeDaoVaribaleName the homeDaoVaribaleName to set
	 */
	public void setHomeDaoVaribaleName(HomeDao homeDaoVaribaleName) {
		this.homeDaoVaribaleName = homeDaoVaribaleName;
	}

	@Override
	public List<Customer> getCustomers() {
		return this.homeDaoVaribaleName.getCustomers();
	}
}