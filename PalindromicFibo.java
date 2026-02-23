import java.util.Scanner;

class PalindromicFibo
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();


		int original = num;

		int rev  = 0;
		int temp = num;


		while(temp>0){
			int digit = temp %10;
			rev = rev*10 + digit;
			temp = temp/10;
		}

		boolean isPalindrome = (original == rev);

		boolean isFibo = false;
		int a = 0, b = 1;

		if(num == 0 || num ==1){
			isFibo = true;
		}else{
			while(b<num){
				int c = a+b;

				a=b;
				b=c;
			}
			if(b == num){
				isFibo = true;
			}
		}
		if(isPalindrome && isFibo){
			System.out.println("Palindromic Fibonacci number");
		}else{
			System.out.println("Not a palindromic Fibonacci number");
		}
	}
}