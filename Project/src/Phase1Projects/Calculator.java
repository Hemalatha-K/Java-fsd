package Phase1Projects;
import java.util.*;
public class Calculator {
	public int Add(int a,int b){
		int res=(a+b);
		return res;
	}
	public int Subract(int c,int d){
		int res=(c-d);
		return res;
	}
	public int Multiply(int e,int f){
		int res=(e*f);
		return res;
	}
	public int Divide(int x,int y){
		int res=(x/y);
		return res;
	}
	public static void main(String args[])
	{
		Calculator ob = new Calculator();
		int x,y,result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number =");
	                 x=sc.nextInt();
	                System.out.print("Enter the Second number =");
	                y=sc.nextInt();
		System.out.print("Enter the Operation to be performed=");
		char operator=sc.next().charAt(0);
		if(operator=='+'){
			result=ob.Add(x,y);
			System.out.println("Result of Adding two numbers="+ result);
		}
		else if(operator=='-'){
			result = ob.Subract(x,y);
			System.out.println("Result of subracting two number="+ result);
		}
		else if(operator=='*'){
			result = ob.Multiply(x,y);
			System.out.print("Result of multiplying two number="+ result);
			
		}
		else if(operator=='/')
		{
			result=ob.Divide(x,y);
			System.out.print("Result of dividing two number= "+ result);
			
		}else
		{
			System.out.print("Error");
		}
	}
}