import java.util.Scanner;

class PrimeDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ener a number: ");
		int num = sc.nextInt();


		while(num>0){
			int digit = num%10;

			if(digit > 1){
				int den = 2;

				while(den <= digit /2){
					if(digit % den == 0){
						break;
					}
					den++;
				}
				if(den > digit /2){
					System.out.println(digit + " ");
				}
			}
			num = num/10;
		}
	
		}
		
	}
