import java.util.Scanner;

class UserInfo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your Full Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter Your Grade: ");
		char  grade = sc.next().charAt(0);
		
		System.out.println("Enter Your Percentage: ");
		float perc = sc.nextFloat();
		
		System.out.println("How many Kilometers you've ran(127 TO -128) : ");
		byte run = sc.nextByte();
		
		System.out.println("How many kilometers you've drove your vehicle(32,767 to -32,768 : ");
		short vehicleDriven= sc.nextShort();
		
		System.out.println("How many kilometers of borders you've crossed? : ");
		long borders=sc.nextLong();
		
		System.out.println("Are you an Indian(answer in true or false) : ");
		boolean country = sc.nextBoolean();
		
		
		
		
		System.out.println("User Information: ");
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);
		System.out.println(perc);
		System.out.println(run);
		System.out.println(vehicleDriven);
		System.out.println(borders);
		System.out.println(country);
		
		
		
	}
}
