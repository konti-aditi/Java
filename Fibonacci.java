import java.util.Scanner;

class Fibonacci
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int num = sc.nextInt();		

		int n1 = 0, n2 = 1, ans;

		while(true)
		{
			ans = n1+n2;

			if(n1==num)
			{
				System.out.println("it is Fibonacci");
				break;
			}
			else if(n1>num)
			{
				System.out.println("it is not Fibonacci");
				break;
			}
			else
			{
				n1=n2;
				n2=ans;
			}
		}
	}
}