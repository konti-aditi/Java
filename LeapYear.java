import java.util.Scanner;

class LeapYear
{
	public static void main(String args[])
	{
		System.out.println("Enter year: ");
		int sc = new Scanner(System.in).nextInt();
		
		String op =
				(sc%100!=0 || sc%400==0)&&(sc%4==0)?
				(sc+ " is a leap year"):
				(sc+ " is not a leap year");

		System.out.println(op);	
	}
}