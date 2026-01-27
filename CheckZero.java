import java.util.Scanner;
class CheckZero
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int number =sc.nextInt();
		
		String op = (number>0)?("is Positive"):
			     (number==0)?("is Zero"):
			     ("is negative");

		System.out.println(op);
				

		
	}
	}