import java.util.Scanner;

class SearchDigit
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int num = sc.nextInt();

		System.out.println("Enter a digit to search: ");
		int digit = sc.nextInt();

		while(num>0)
		{
			num=num%10;

			if(num==digit){
				System.out.println("Digit present");
				return;
			}
			num/=10;

		}
		
		System.out.println("Digit not found");
		
		
	}
}