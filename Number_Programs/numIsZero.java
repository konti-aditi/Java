import java.util.Scanner;

class numIsZero
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		while(num>0){
			if(num%10 == 0){
				System.out.println("The number is having zero");
				return;
			}
			num/=10;
		}

		System.out.println("The number is not having zero");
		
	}
}