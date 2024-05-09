package com.SpringBootEMS_API.SpringBoo_EMS_API;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	SessionFactory sf;
	
	@PostMapping("InsertAPIs/{eid}/{FirstName}/{LastName}/{DOB}/{Dept}/{Position}/{Salary}")
	public void InsertAPI(@PathVariable int eid,@PathVariable String FirstName,@PathVariable  String LastName,@PathVariable String  DOB,@PathVariable String Dept,@PathVariable  String Position,@PathVariable float Salary) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	 
Employee m=new Employee(eid,FirstName,LastName,DOB,Dept,Position,Salary);
		s.save(m);
		t.commit();
		s.close();
		
	}

	@GetMapping("ShowSingleAPIs/{eid}")
	public Employee ShowSinglAPI(@PathVariable int eid) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	 
Employee m=s.get(Employee.class, eid);
		s.save(m);
		t.commit();
		s.close();
		return m;
		
	}
	
	@GetMapping("ShowMultipleAPIs/{eid}")
	public List<Employee>all(){
		Session s=sf.openSession();
		Query<Employee> query=s.createQuery("from Employee");

		List<Employee>list=query.list();
		
		return list;
		
	}
	@PatchMapping("UpdatesingleAPIs/{eid}/{FirstName}")
	public Employee UpdateSinglAPI(@PathVariable int eid,@PathVariable String FirstName) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	 
Employee m=s.get(Employee.class, eid);
         m.setFirstName(FirstName);
//         m.isSalary();
		s.update(m);
		t.commit();
		s.close();
		return m;
		
	}
	@DeleteMapping("deletesingleAPIs/{eid}")
	public Employee deleteSinglAPI(@PathVariable int eid) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	 
Employee m=s.get(Employee.class, eid);
//         m.setFirstName(FirstName);
//         m.isSalary();
		s.delete(m);
		t.commit();
		s.close();
	
		return m;
		
		
	}
	
}
