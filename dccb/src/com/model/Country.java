package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	
	int COUNTRY_ID;
	String COUNTRY_CODE;
	String COUNTRY;
	String CURRENCY;
	
	
	public int getCOUNTRY_ID() {
		return COUNTRY_ID;
	}
	public void setCOUNTRY_ID(int cOUNTRY_ID) {
		COUNTRY_ID = cOUNTRY_ID;
	}
	public String getCOUNTRY_CODE() {
		return COUNTRY_CODE;
	}
	public void setCOUNTRY_CODE(String cOUNTRY_CODE) {
		COUNTRY_CODE = cOUNTRY_CODE;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	public String getCURRENCY() {
		return CURRENCY;
	}
	public void setCURRENCY(String cURRENCY) {
		CURRENCY = cURRENCY;
	}
	public Country(int cOUNTRY_ID, String cOUNTRY_CODE, String cOUNTRY, String cURRENCY) {
		super();
		COUNTRY_ID = cOUNTRY_ID;
		COUNTRY_CODE = cOUNTRY_CODE;
		COUNTRY = cOUNTRY;
		CURRENCY = cURRENCY;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
