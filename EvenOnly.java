import java.util.Scanner;

class EvenOnly
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");

		int num = sc.nextInt();


		while(num >0){
			int last = num%10 ;
          if (last%2 == 0) {
          	System.out.println("The even numbers are: "+last);
          	         	
          }
          
          num = num/10;
          
		}
		
	}
	
}