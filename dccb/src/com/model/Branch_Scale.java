package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch_Scale {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int scale_id;
	
	int limit;
	int number_of_employees;
	int number_of_managers;
	
	public int getScale_id() {
		return scale_id;
	}
	public void setScale_id(int scale_id) {
		this.scale_id = scale_id;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getNumber_of_employees() {
		return number_of_employees;
	}
	public void setNumber_of_employees(int number_of_employees) {
		this.number_of_employees = number_of_employees;
	}
	public int getNumber_of_managers() {
		return number_of_managers;
	}
	public void setNumber_of_managers(int number_of_managers) {
		this.number_of_managers = number_of_managers;
	}
	public Branch_Scale(int scale_id, int limit, int number_of_employees, int number_of_managers) {
		super();
		this.scale_id = scale_id;
		this.limit = limit;
		this.number_of_employees = number_of_employees;
		this.number_of_managers = number_of_managers;
	}
	public Branch_Scale() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
