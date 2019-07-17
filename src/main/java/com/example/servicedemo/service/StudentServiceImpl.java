package com.example.servicedemo.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.servicedemo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	 public HashMap<Integer, String> student_list = new HashMap<>();
	    

	@Override
	public Student save_student(Student stud_obj) {
		// TODO Auto-generated method stub
	Student stud1= new Student();
		
		stud1.setId(stud_obj.getId());
		stud1.setName(stud_obj.getName());
		stud1.setRoll_no(stud_obj.getRoll_no());
		
		return stud1;
		
	}

	@Override
	public HashMap<Integer, String> hash_putstudent() {
		
		// TODO Auto-generated method stub		     
	     student_list.put(1, "mary");
	     student_list.put(2, "David");
	     student_list.put(2, "Rose");
	     student_list.put(4, "John"); 
	     
	    System.out.println("The collection is: " + student_list.values()); 
	     
	    return student_list;
	}

	
	
	
	
	
	

}
