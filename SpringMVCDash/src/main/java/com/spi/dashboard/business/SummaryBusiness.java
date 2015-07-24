package com.spi.dashboard.business;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spi.dashboard.dao.SummaryDao;
import com.spi.dashboard.model.SummaryModel;

public class SummaryBusiness {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(SummaryBusiness.class);
	private SummaryDao sumDao;
	

	public SummaryDao getSumDao() {
		return sumDao;
	}

	public void setSumDao(SummaryDao sumDao) {
		this.sumDao = sumDao;
		LOGGER.info("#### Done with SummaryBusiness construction!");

	}
	
	public List<SummaryModel> getAllSummaries() {
		return sumDao.getSummary();
	}

}
