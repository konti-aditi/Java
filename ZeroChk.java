import java.util.Scanner;

class ZeroChk
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");

		int num = sc.nextInt();

		while(num >0){
			int last = num%10 ;
          if (last%10 == 0) {
          	System.out.println("The number has zero:");
          	break;          	
          }
          else{
          	System.out.println("The number doesn't have zero");
          }
          num = num/10;
          break;
		}
		
	}
	
}