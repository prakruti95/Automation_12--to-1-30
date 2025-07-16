import java.util.Scanner;

public class Student
{
       
    int id;
    String name;
    String email;
    
    
    void display()
    {
      System.out.println(id+" "+name+" "+email);  
    }
    
    
	public static void main(String[] args) 
	{
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Your Id");
	    int i1 = sc.nextInt();
	    
	    System.out.println("Enter Your Name");
	    String n1 = sc.next();
	    
	    System.out.println("Enter Your Email");
	    String e1 = sc.next();
	    
	   
	    //classname objname = new classname();
	    
	    //UserInput
	    Student s1 = new Student();///Object
	    s1.id=i1;
	    s1.name =n1;
	    s1.email = e1;
	    
	    //Assign
	    Student s2 = new Student();
	    s2.id=102;
	    s2.name ="sahdev";
	    s2.email = "s@gmail.com";
	    
	    
	    s1.display();
	    s2.display();
	    
	   // System.out.println(s1.id+" "+s1.name+" "+s1.email);//print
	   // System.out.println(s2.id+" "+s2.name+" "+s2.email);//print
	    
	    
	}
}
