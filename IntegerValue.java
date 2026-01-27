import java.util.Scanner;

class IntegerValue 
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();

	String op =
			(num>0)? (num+" is positive"):
			(num+" is negative");
	System.out.println(op);
	}
}