class A
{
	void a()
	{
		System.out.println("A called");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("B called");
	}
}
public class SingleInEx 
{
	public static void main(String[] args) 
	{
		B b = new B();
		
		b.a();
		b.b();
		
	}
}
