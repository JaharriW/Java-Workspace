package StudentManagement.model;

public class Student 
{
	private boolean isCurrentStudent;
	private int gradeLevel;
	private String idNumber; 
	private String name; 
	private String gender; 
	private int age;
	private double gpa;
	
	public Student()
	{
		isCurrentStudent = false;
		gradeLevel =0 ;
		idNumber = "S00000000";
		name = "";
		gender = "";
		age = 0;
		gpa = 0.0;
	}
	public String toString()
	{
		String str = "";
		return str;
	}
}
