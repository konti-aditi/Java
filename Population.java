class Population
{
	public static void main(String []args)
	{
		long currentPop = 312032486;
		//              days hrs min sec yr
		long seconds = (365* 24* 60*60)*5;

		final long BIRTH = seconds/7;
		final long DEATH = seconds/13;
		final long IMMIGRANTS = seconds/45;


		long newPop = currentPop+BIRTH-DEATH+IMMIGRANTS;
		System.out.println("Previous Population: " +currentPop);
		System.out.println("Current Population: " +newPop);


		
}
}