import java.util.Scanner;

public class Program_1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = scan.nextDouble();
		System.out.println("Enter the value of b");
		double b = scan.nextDouble();
		
		System.out.println("Enter the operator (ADD, Substraction, Multiplication, Division)");
		char operator = scan.next().charAt(0);
		
		double res = 0;
		switch(operator)
		{
		case '+':   res = a + b;
            break;
            
        case '-': res = a - b;
            break;
  
        case '*': res = a * b;
            break;
       
        case '/': res = a / b;
        	break;
  
        default:
  
            System.out.println("Invalid input");
  
            break;
        }
  
        System.out.println("The final result:");
       
        System.out.println(a + " " + operator + " " + b + " = " + res);
    }

}
