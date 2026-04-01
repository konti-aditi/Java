import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int num = sc.nextInt();


		int rev = 0;

		int temp = num;

		while(temp!=0)
		{
			int last = temp%10;

			rev = rev*10+last;

			temp = temp/=10;
		}


		if(num==rev)
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
		
	}
}