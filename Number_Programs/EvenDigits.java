import java.util.Scanner;

class EvenDigits
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();

		while(num>0){

			int digit = num%10;

		if(digit%2==0)
		{
			System.out.println("Even digits are: " + digit);
		}

		num=num/10;
		
	}
	
}
}