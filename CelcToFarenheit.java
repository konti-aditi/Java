import  java.util.Scanner;

class CelcToFarenheit
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number(Celsius): ");
		double Celsius =sc.nextDouble();

		double Farenheit = (9.0/5)*Celsius+32;
		System.out.println("The value in Farenheit is: "+Farenheit);
	}
	}