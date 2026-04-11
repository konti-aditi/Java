class Factors{
	public static void main(String[] args) 
	{
	float num = 13;

	int den = 1;
	int ct = 1;

	while(den<=num/2)
	{
		if(num%den==0)
		{
			ct++;
			System.out.println(den);
		}
		den++;

	}

	System.out.println(num);

	System.out.println("count is: "+ ct);
	}
	
}