package com.example.servicedemo.service;

import java.util.Date;
import java.util.HashMap;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.example.servicedemo.model.Employee;
import com.example.servicedemo.util.HibernateUtil;
@Service
public class employeeServiceImpl implements employeeservice {

	@Override
	public String save_employee() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setName("Pankaj");
		emp.setRole("CEO");
		emp.setInsertTime(new Date());
		
		//Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		session.save(emp);
		//Commit transaction
		session.getTransaction().commit();
		System.out.println("Employee ID="+emp.getId());
		
		//terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
		
		return "sdfsdf";
	}

	@Override
	public HashMap<Integer, String> hash_putemployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
