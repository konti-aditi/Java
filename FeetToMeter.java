import java.util.Scanner;

class FeetToMeter
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(feet): ");

		double feet = sc.nextDouble();

		double meters = 0.305*feet;

		System.out.println("The value in meters is: " +meters);
	}
	}