import java.util.Scanner;
class FindDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int num = 45874093;

		System.out.println("Enter a digit to find:");
		int digit = sc.nextInt();

		
		boolean found  = false;

		while(num > 0)
		{
			int extract = num%10;

			if(extract==digit)
			{
				found = true;
				break;
			}
			num = num/10; 
		}

			if(found)
			{
				System.out.println("Digit found");
			}
			else
			{
				System.out.println("Not found");
			}


		

		
	}
}