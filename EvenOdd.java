import java.util.Scanner;

class EvenOdd
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String op = (num%2 == 0)?("is even"):("is odd");

		System.out.println(op);
				
	}
	}