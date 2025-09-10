import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTest 
{
	@Test
	public void t1()
	{
		//assertEquals(10,20);
		assertEquals(10,10);
	}
	@Test
	@Ignore
	public void t2()
	{
		System.out.println("T2");
	}
	@Test
	public void t3()
	{
		System.out.println("T3 Called");
	}
}
