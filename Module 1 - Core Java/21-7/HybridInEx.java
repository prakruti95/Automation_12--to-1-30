class A2
{
	void a2()
	{
		System.out.println("A2 called");
	}
}
class B2 extends A2
{
	void b2()
	{
		System.out.println("B2 called");
	}
}
interface C2 
{
	void c2();
}
class D2 extends B2 implements C2
{
	void d2()
	{
		System.out.println("D2 called");
	}

	@Override
	public void c2() 
	{
		// TODO Auto-generated method stub
		
			System.out.println("C2 called");
		
	}
}
public class HybridInEx 
{
	public static void main(String[] args) {
		
		D2 d = new D2();
		d.a2();
		d.b2();
		d.c2();
		d.d2();
		
	}
}
