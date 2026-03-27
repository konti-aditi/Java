import java.util.Scanner;

class SearchNum{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int num = sc.nextInt();

		int temp = 0;

		while(temp>0)
		{
			int rem = temp%10;

			if(rem == digit)
			{
				found = true;
				break;
			}

			temp = temp/10;

		}
		if(found)
			System.out.println("digit found");
	}
	else{
		System.out.println("digit not found");
	}	
}