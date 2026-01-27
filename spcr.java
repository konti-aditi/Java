import java.util.Scanner;

class spcr
{
	public static void main (String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		String character = 
					((ch>=0&&ch<=47)||(ch>=58&&ch<=64)||(ch>=91&&ch<=96)||(ch>=123&&ch<=127))?
					(ch+ " is a special char"):
					(ch+ " is not a special char");
		System.out.println(character);
	}

}