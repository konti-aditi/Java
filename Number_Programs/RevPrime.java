
class RevPrime
{
	public static void main(String[] args) {

		int num = 333;
		int den = 2;
		int temp = 0;
		int rev = 0;


		while(den<num)
		{
			if(num%den==0)
			{
				System.out.println("it is not prime no");
				return;
			}
			den++;
		}

		while(num>0) 
		{
			temp = num%10;
			rev = rev*10+temp;
			num =num/10;

			if(rev%den==0)
			{
				System.out.println("given no is prime no and its reverse also");
				break;
			}
			den++;
		}






		
	}
	
}