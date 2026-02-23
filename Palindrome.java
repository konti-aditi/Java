import java.util.Scanner;


class Palindrome

{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int num = sc.nextInt();

			int rev = 0;

			int temp = num;
			while(temp != 0)
			{
				int last = temp%10;
				rev = rev*10+last;

				num = temp/=10;

			}

			if(num == rev)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
			}
		}	
}