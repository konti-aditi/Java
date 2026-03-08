import java.util.Scanner;

class numIsZero
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if(num%10==0){
			System.out.println("The number is having zero");
			num = num/10;
		}
		else{
			System.out.println("the number is not having zero");
		}
		
	}
}