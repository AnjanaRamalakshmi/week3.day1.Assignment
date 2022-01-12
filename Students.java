package week3.day1ass;

public class Students
{
	public void getStudentInfo(int id)
	{
		System.out.println("Student Id = "+id);
	}
	public void getStudentId(int id, String email)
	{
		System.out.println("Student Id ="+id);
		System.out.println("Email id = "+email);
	}
	public void getStudentInfo(String email, int phonenumber)
	{
		System.out.println("Email id = "+email);
		System.out.println("Phone number = "+phonenumber);
	}
	public static void main(String[] args) 
	{
		Students students = new Students();
		students.getStudentInfo(101);
		students.getStudentId(101, "anjana@gmail.com");
		students.getStudentInfo("anjanag1995@gmail.com", 12345555);
	}

}
