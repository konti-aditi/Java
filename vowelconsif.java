import java.util.Scanner;

class vowelconsif
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");

		char alphabet = sc.next().charAt(0);

		// String  vowels = alphabet == 'a' ||alphabet =='e' ||alphabet == 'i' ||alphabet =='o' ||alphabet =='u';

		if(alphabet == 'a' ||alphabet =='e' ||alphabet == 'i' ||alphabet =='o' ||alphabet =='u'){

			System.out.println("It is a vowel");

		}else{
			System.out.println("It is a Consonent");	

			}
	}

}