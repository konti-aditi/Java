
class RevPrime
{
	public static void main(String[] args) {
		int num = 10;
		int dev = 2;

		while(dev<num)
		{
			if(num%dev==0)
			{
				break;
			}
			dev++;
		}

		if(num==dev)
		{
			System.out.println("it is prime");
		}
		else{
			System.out.println("it's not prime");
		}
		
	}
}