import java.util.Scanner;

class SumProd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;tft677
		int product = 1;


		while(num!=0)
		{
			 int last = num%10;

			 sum = sum+last;

			 product = product+last;

			 num = num/10;
		}

		if(sum==product)
		{
			System.out.println("sum and product is same");
		}
		else
		{
			System.out.println("Sum and product are different");
		}

		
	}
}