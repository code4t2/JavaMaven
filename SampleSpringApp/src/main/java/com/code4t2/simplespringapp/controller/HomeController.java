package com.code4t2.simplespringapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.code4t2.simplespringapp.business.HomeBusiness;
import com.code4t2.simplespringapp.model.Customer;

@RestController
public class HomeController {
	
	private HomeBusiness homeBusinessVaribaleName;
	
	public void setHomeBusinessVaribaleName(HomeBusiness homeBusinessVaribaleName) {
		this.homeBusinessVaribaleName = homeBusinessVaribaleName;
	}

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ModelAndView loadHomePage(HttpServletRequest request, HttpServletResponse response) throws Exception {	
		return new ModelAndView("home", "homePageModel", this.homeBusinessVaribaleName.getCustomers());
	}
	
	@RequestMapping(value="/returnjson", method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> getBookCase() {
		return this.homeBusinessVaribaleName.getCustomers();
	}
	
	@RequestMapping(value="/customer", method = RequestMethod.GET)
		public @ResponseBody Customer getCustomer() {
		return new Customer("CustomerID", "CustomerName", "CompanyName");
	}
}