package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BBranch {
	@Id
	@GeneratedValue
	int branch_id;
	
	String branch_name;
	
	@ManyToOne
	Country country;
	
	@ManyToOne
	Branch_Scale branch_sscale;
	
	@ManyToOne
	State state;
	
	String location;
	
	String Creation_date;
	
	String admin_id;

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Branch_Scale getBranch_sscale() {
		return branch_sscale;
	}

	public void setBranch_sscale(Branch_Scale branch_sscale) {
		this.branch_sscale = branch_sscale;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCreation_date() {
		return Creation_date;
	}

	public void setCreation_date(String creation_date) {
		Creation_date = creation_date;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public BBranch(int branch_id, String branch_name, Country country, Branch_Scale branch_sscale, State state,
			String location, String creation_date, String admin_id) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.country = country;
		this.branch_sscale = branch_sscale;
		this.state = state;
		this.location = location;
		Creation_date = creation_date;
		this.admin_id = admin_id;
	}

	public BBranch() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
