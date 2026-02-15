import java.util.Scanner;

class CountEvenOdd
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");

		int num = sc.nextInt();

		int count1 = 0;
		int count2 = 0;

		while(num >0){
			int last = num%10 ;
          if (last %2 == 0) {
          	count1++;
          	
          }
          else{
          	count2++;
          }
          num = num/10;
		}
		System.out.println("count of even digit :"+count1);
		System.out.println("count of odd digit is :"+count2);

		
	}
	
}