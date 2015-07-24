package com.spi.dashboard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spi.dashboard.business.SummaryBusiness;
import com.spi.dashboard.model.SummaryModel;

@Controller
public class SummaryController {

	@Autowired
    @Qualifier("sumBusObj")
	private SummaryBusiness sumBus;

	public SummaryBusiness getSumBus() {
		return sumBus;
	}

	public void setSumBus(SummaryBusiness sumBus) {
		this.sumBus = sumBus;
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public @ResponseBody List<SummaryModel> showAll() {
		return sumBus.getAllSummaries();
	}
	
	@Autowired
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView loadHome(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("home");
	}

	/*
	 * @RequestMapping(value = "/test", method = RequestMethod.GET)
	 * public @ResponseBody SummaryModel getSample() {
	 * return (new SummaryModel(2007, "XX", "YY"));
	 * }
	 */

}
