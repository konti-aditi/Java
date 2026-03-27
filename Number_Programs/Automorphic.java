class Automorphic
{
	public static void main(String[] args) {

		int num = 25;
		int pow = 1;

		for(int i=num; i!=0; i/=10)
		{
			pow*=10;
		}
		int sq = num*num;

		if(sq%pow == num)
		{
			System.out.println("it is automorphic");
		}
		else{
			System.out.println("it is not automorphic");
		}
		
	}
}