package com.code4t2.simplespringapp.model;

public class Customer {
	
	private String customerId;
	private String contactName;
	private String companyName;
	
	public Customer() {
	}

	public Customer(String contactName) {
		this.contactName = contactName;
	}
	
	public Customer(String customerId, String contactName, String companyName) {
		this.customerId = customerId;
		this.contactName = contactName;
		this.companyName = companyName;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}