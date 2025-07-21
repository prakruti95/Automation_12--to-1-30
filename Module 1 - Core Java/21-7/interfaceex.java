interface Print
{
	void p();
}
interface Print2
{
	void p2();
}
public class interfaceex implements Print,Print2
{

	@Override
	public void p2() 
	{
		
		System.out.println("P2 called");
		
	}

	@Override
	public void p() 
	{
		
		System.out.println("P called");
	}
	public static void main(String[] args) 
	{
		interfaceex i1 = new interfaceex();
		
		
		i1.p();
		i1.p2();
	}
}

