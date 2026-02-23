import java.util.Scanner;

class FiboDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int num = sc.nextInt();

		int n1 = 0, n2=1, ans;

		while(true){

			ans = n1+n2;

			n1=n2;
			n2=ans;

		}

		if(n2==n1){
			System.out.println("Fibonacci number");
		}else {
			System.out.println("Not a fibonacci number");
		}

		
	}
}