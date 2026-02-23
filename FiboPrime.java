import java.util.Scanner;

class FiboPrime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		boolean isPrime = true;

		if(num <= 1){
			isPrime = false;
		}else{
			int den = 2;
			while(den <= num/2){
				if(num %den ==0){
					isPrime = false;
					break;
				}
				den++;
			}
		}

		boolean isFibo = false;

		int a = 0, b = 1;

		if(num == 0 || num ==1){
			isFibo = true;
		}else{
			while(b < num){
				int c = a+b;
				a=b;
				b=c;
			}
			if(b == num){
				isFibo = true;
			}
		}

		if(isPrime && isFibo){
			System.out.println("It is fibonacci number");
		}else{
			System.out.println("it is not a fibonacci number");
		}
	}
}
