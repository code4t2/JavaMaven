package com.code4t2.simplespringapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("about.html")
public class AboutController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView loadHomePage(HttpServletRequest request, HttpServletResponse response) throws Exception {	
		return new ModelAndView("about");// ModelAndView("about", "aboutPageModel", "This is incredibly silly");
	}
}
