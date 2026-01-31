import java.util.Scanner;

class Calculator
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter operand 1: ");
		double opr1 = sc.nextDouble();
		
		System.out.print("Enter an operator: ");
		char opr = sc.next().charAt(0);

		System.out.println("Enter operand2 : ");
		double opr2 = sc.nextDouble();

		double op =
				(opr=='+')?(opr1+opr2):
				(opr=='-'?(opr1-opr2):
				(opr=='*'?(opr1*opr2):
				(opr=='/'?(opr1/opr2):
				(opr=='%'?(opr1%opr2):
				(Double.MAX_VALUE)))));

		if(op!=Double.MAX_VALUE)
			System.out.println(opr1+" "+opr+" "+opr2+"= "+op);
		else
			System.out.println("Entered operator is invalid");

		
	}
}



//higher order function
//polyfill
//loops
//filter
//map
//foreach