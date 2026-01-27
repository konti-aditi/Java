import java.util.Scanner;

class abc
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char ch =sc.next().charAt(0);
		
		String op = 
				((ch=='a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'))?
                                 (ch+ " is a vowel"):
				 (ch+ " is not a vowel");
		System.out.println(op);
		
	}
}
