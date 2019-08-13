package com.sample.org.app.setting;

public enum RegState {
	ACTIVE("ACTIVE"),
	INATIVE("INATIVE"),	
	INCOMPLETE("INCOMPLETE");
	
	private String state;
	
	RegState(String state){
		this.state=state;
	}
	
	String state() {		
		return state;
	}
	
	

}
