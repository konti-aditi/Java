import java.util.Scanner;

class alphabet
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);

		String output = ((ch>=65&&ch<=90)||(ch>=97&&ch<=122))?
		(ch+ " is an alphabet"):
		(ch+ " is not an alphabet");

		System.out.println(output);
	}
}