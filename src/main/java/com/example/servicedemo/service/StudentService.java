package com.example.servicedemo.service;


import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.servicedemo.model.Student;


@Service
public interface StudentService {

	public Student save_student(Student student);
	
	public HashMap<Integer, String>  hash_putstudent();
	

	
}
