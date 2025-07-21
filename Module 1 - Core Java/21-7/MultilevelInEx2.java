class A1
{
	void a()
	{
		System.out.println("A called");
	}
}
class B1 extends A1
{
	void b()
	{
		System.out.println("B called");
	}
}
class C1 extends B1
{
	void c()
	{
		System.out.println("C called");
	}
}
public class MultilevelInEx2 
{
	public static void main(String[] args) 
	{
		
		C1 c1 = new C1();
		c1.a();
		c1.b();
		c1.c();
	}
}
