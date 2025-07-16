public class Student
{
       
    int id;
    String name;
    String email;
    
    
	public static void main(String[] args) 
	{
	    
	    //classname objname = new classname();
	    Student s1 = new Student();///Object
	    s1.id=101;//variable value assign using object
	    s1.name ="manthan";
	    s1.email = "m@gmail.com";
	    
	    Student s2 = new Student();
	    s2.id=102;
	    s2.name ="sahdev";
	    s2.email = "s@gmail.com";
	    
	    System.out.println(s1.id+" "+s1.name+" "+s1.email);//print
	    System.out.println(s2.id+" "+s2.name+" "+s2.email);
	    
	    
	}
}
