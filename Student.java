package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Student name = G. Anjana Ramalakshmi");
	}
	public void studentDept()
	
	{
		System.out.println("Student Department = CSE");
	}
	public void studentId()
	{
		System.out.println("student Id = 215027008");
	}
	public static void main(String[] args) 
	{
		Student student = new Student();
		student.studentName();
		student.studentId();
		student.studentDept();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.departmentName();

	}

}
