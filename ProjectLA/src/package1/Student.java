package package1;

public class Student {
	int rollNo, age;          //Variables
	public void display1()    //Method1
	{
		System.out.println("Welcome to all of you");	
	}
	public void display2()    //Method2
	{
		System.out.println("Automation is very easy");	
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the class");
		Student stud=new Student();  //Object Creation
		stud.rollNo=17389;
		stud.age=35;
		System.out.println("Student Roll Number:"+stud.rollNo);
		System.out.println("Student Age:"+stud.age);
		stud.display1();
		stud.display2();				
	}
}
