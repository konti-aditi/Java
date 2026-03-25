import java.util.Scanner;

class CheckNum
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int num = sc.nextInt();

		String op = (num>0) ? ("is positive") : ("is negative");

		System.out.println(op);


		}		
	}
