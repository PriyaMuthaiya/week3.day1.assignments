package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Priya Muthaiya");
	}
	
	public void studentDept() {
		System.out.println("Computer Science");
	}
	
	public void studentID() {
		System.out.println("120516");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ObjStudent=new Student();
		ObjStudent.CollegeName();
		ObjStudent.CollegeID();
		ObjStudent.CollegeRank();
		ObjStudent.departmentName();
		ObjStudent.studentDept();
		ObjStudent.studentID();
		ObjStudent.studentName();
		
	}

}
