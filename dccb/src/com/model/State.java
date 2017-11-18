package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	int state_id;
	String state_code;
	String state;
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public State(int state_id, String state_code, String state) {
		super();
		this.state_id = state_id;
		this.state_code = state_code;
		this.state = state;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
