public class Main
{
    
 	public static void main(String[] args) 
	{
	    int i,j,space,num;
	     
		for(i=1;i<=5;i++)
		{
		    for(space=1;space<=(5-i);space++)
		    {
		        System.out.print(" ");
		    }
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	
	}
}


