package com.spi.dashboard.model;

public class SummaryModel {

//	public SummaryModel() {}
//
//	public SummaryModel(int financialYear, String transactionType, String productCount) {
//		this.financialYear = financialYear;
//		this.transactionType = transactionType;
//		this.productCount = productCount;
//	}

	private int financialYear;
	private String transactionType;
	private int productCount;

	public int getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(int financialYear) {
		this.financialYear = financialYear;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

}
