import java.util.Scanner;

class CurrencyConverter
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		//infiniteLoop
		
		for( ; ; ){
		
		System.out.println("********** WELCOME ***********\n");
		System.out.println("Enter the amount in INR: ");
		double amount = sc.nextDouble();


		System.out.println("1.USD \n2.EUR \n3.KWD \n4.GBP \n5.JPY \n6.CAD \n7.AUD \n8.BTC \n9.CNY \n10.IQD");

		System.out.println("Enter your response: ");
		String resp = sc.next().toUpperCase();

		Boolean assump = true;

 		double ConvertedAmount = 0;

		if(resp.equals(("USD"))){
			ConvertedAmount = amount/90.21;
		}
		else if(resp.equals("EUR"))
		{
			ConvertedAmount = amount/106.38;
		}
		else if(resp.equals("KWD"))
		{
			ConvertedAmount = amount/293.61;
		}
		else if(resp.equals("GBP"))
		{
			ConvertedAmount = amount/123.25;
		}
		else if(resp.equals("JPY"))
		{
			ConvertedAmount = amount/0.58;
		}
		else if(resp.equals("CAD"))
		{
			ConvertedAmount = amount/66.25;
		}
		else if(resp.equals("AUD"))
		{
			ConvertedAmount = amount/63.44;
		}
		else if(resp.equals("BTC"))
		{
			ConvertedAmount = amount/6856341.91;
		}
		else if(resp.equals("CNY"))
		{
			ConvertedAmount = amount/13.03;
		}
		else if(resp.equals("IQD"))
		{
			ConvertedAmount = amount/0.06;
		}
		else
		{
			assump = false;
			System.out.println("\n  INVALID RESPONSE  \n");

		} if (assump)
			System.out.printf
			("%n%20.2f INR = %.2f  %s%n," , amount,ConvertedAmount,resp);

	}

		
	}

}