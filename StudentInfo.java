package week3.day1.assignments;

public class StudentInfo {

	
	public void getStudentInfo(int id) {
		System.out.println("id :"+id);
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("id :"+id+" Name: "+name);
	}
	
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Email :"+email+ " Phone Number :"+phoneNumber);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		StudentInfo obj=new StudentInfo();
		obj.getStudentInfo(1235);
		obj.getStudentInfo(12345, "Priya");
		obj.getStudentInfo("mepriya1994@gmail.com", 819828386);

	}

}
