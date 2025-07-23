package assignment;

public class B23FloydsTriangle 
{
	public static void main(String[] args) 
	{
		int z, o;
		for(int i = 1; i <=5; ++i)
		{	
			if(i%2 == 0)
			{
				z=1; o=0;
			}
			else
			{
				o=1; z=0;

			}
				
			for(int j = 1 ; j <= i; j++)
			if(j%2==0)
			System.out.print(z);
			else		
			System.out.print(o);
			System.out.println("");
		}
		
	}
}
