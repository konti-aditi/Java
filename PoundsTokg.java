import java.util.Scanner;

class PoundsTokg
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(pounds): ");
		double pounds = sc.nextDouble();

		double kg = 0.454*pounds;
		System.out.println(kg);
	}
	}