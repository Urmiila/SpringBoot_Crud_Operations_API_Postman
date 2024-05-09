package com.SpringBootEMS_API.SpringBoo_EMS_API;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

@Id
	private int eid;
    private String FirstName;
    private String LastName;
    private String DOB;   
    private String Dept;
    private String Position;
    private float Salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String firstName, String lastName, String dOB, String dept, String position,
			float salary) {
		super();
		this.eid = eid;
		FirstName = firstName;
		LastName = lastName;
		DOB = dOB;
		Dept = dept;
		Position = position;
		Salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public float isSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", DOB=" + DOB
				+ ", Dept=" + Dept + ", Position=" + Position + ", Salary=" + Salary + "]";
	}

}
