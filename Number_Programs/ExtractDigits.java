import java.util.Scanner;

class ExtractDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int last = 0;

		while(num>0)
		{
			last = num%10;
			System.out.println(last);

			num = num/10;
		}
		
	}
	
}