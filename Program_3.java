import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = scan.nextInt();
		int j=0;
			if(a%2==0)
				{
					 j= a-1;
				}
				else
					{
						 j=a;
					}
				int k=1;

				for(int i=1; i<=j;i++)
				{
					System.out.print(k+" ,");
					k=k+2;
				}
			}
		
}

	


