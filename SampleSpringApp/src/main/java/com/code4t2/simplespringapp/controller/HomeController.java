package com.code4t2.simplespringapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.code4t2.simplespringapp.business.HomeBusiness;

@RequestMapping("home.html")
public class HomeController {
	
	private HomeBusiness homeBusinessVaribaleName;
	
	/**
	 * @param homeBusinessVaribaleName the homeBusinessVaribaleName to set
	 */
	public void setHomeBusinessVaribaleName(HomeBusiness homeBusinessVaribaleName) {
		this.homeBusinessVaribaleName = homeBusinessVaribaleName;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView loadHomePage(HttpServletRequest request, HttpServletResponse response) throws Exception {	
		return new ModelAndView("home", "homePageModel", this.homeBusinessVaribaleName.getCustomers());
	}
}