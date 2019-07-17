package com.example.servicedemo.model;

public class Student {

	public Integer id;
	
	public String roll_no;
	
	public String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public String tostring() {		
		return name +""+name+""+id;		
	}
	
}
