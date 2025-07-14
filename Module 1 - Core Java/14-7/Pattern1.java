import java.util.Scanner;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		
		int i,j,num;

		System.out.println("Enter Your Number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}
