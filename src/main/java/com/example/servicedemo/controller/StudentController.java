package com.example.servicedemo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicedemo.model.Student;
import com.example.servicedemo.service.StudentService;
import com.example.servicedemo.service.employeeservice;

@RestController
public class StudentController {

	
	@Autowired
	StudentService stud_service;	
	
	@Autowired
	employeeservice emp_service;
	
	
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public @ResponseBody Student save_student(@RequestBody Student student_objs) {			
	    return  stud_service.save_student(student_objs);		
	}
	
	
	
	@RequestMapping(value="/test2",method=RequestMethod.GET)
	public @ResponseBody HashMap<Integer, String> hashout_student(){		
		return stud_service.hash_putstudent();
	}
	
	
	@RequestMapping(value="/test3",method=RequestMethod.GET)
	public @ResponseBody String hashout_student1(){		
		
		emp_service.save_employee();
		
		return "helo";
	}
	
	
}
