package com.example.servicedemo.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.servicedemo.model.Employee;
@Service
public interface employeeservice {

	public String save_employee();
	
	public HashMap<Integer, String>  hash_putemployee();
	
}
