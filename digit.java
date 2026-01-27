import java.util.Scanner;

class digit
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);

		String number = 
				((ch>=48&&ch<=57))?
				(ch+ " is a number"):
				(ch+ " is not a number");
		System.out.println(number);

	}
}