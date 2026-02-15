import java.util.Scanner;

class LoanCalculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(; ;)
		{
			System.out.println("\n ***** WELCOME ***********\n");
			System.out.println("Amount: ");
			double amount = sc.nextDouble();
			if(amount<1000 || amount>100000)
			{
				System.out.println("\n INVALID AMOUNT \n");
				continue;
			}

			System.out.println("Rate of interest(P.M):");
			double interest = sc.nextDouble();

			if(interest<1 || interest>30)
			{
				System.out.println("\n INVALID INTEREST \n");
				continue;
			}
			System.out.println("LOAN TENURE(months): ");
			int tenure = sc.nextInt();

			if(tenure<3 || tenure>36)
			{
				System.out.println("\n INVALID TENURE \n");
				continue;
			} 


			double perMonthInt = (amount/100)*interest;
			double totalInterestAmount = perMonthInt*tenure;
			double emi = (amount+totalInterestAmount)/tenure;
			double totalAmount = amount+totalInterestAmount;

			System.out.println("\nMonthly emi: "+emi);
			System.out.println("Principal Amount: "+amount);
			System.out.println("total interest: "+totalInterestAmount);
			System.out.println("Total Amount: "+totalAmount);
			
		}
	}
}



//javac demo.java
//javap -c demo.class
//does java have the concept of global variables?
//does java have pointers
//does java have linkedlist
//does liknedlist use pointers?


