import java.util.Scanner;

class CaseCheck
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char ch = sc.next().charAt(0);

		String alphabet = 
					
					((ch>=65&&ch<=90)?
					(ch+ " is Uppercase alphabet"):
					(ch+ " is lowercase alphabet"));

		System.out.println(alphabet);
					
		
		
	}
}