class AvgSpeed
{
	public static void main(String[]args)
	{
		double km = 14;
		int minutes = 45;
		int seconds = 30;

		double miles = km*0.621371;

		double hrs = (minutes+seconds/60.0)/60.0;

		double speed = miles/hrs;

		System.out.println(speed);
}
}