import java.util.Scanner;

class tables
// {
// 	public static void main(String[] args) {

// 		Scanner sc = new Scanner(System.in);
		
// 		int i = 1;
// 		int num = sc.nextInt();

// 		while(i<=10){

// 			System.out.println(num*i);
// 			i++;
// 		}
// 		System.out.println(i);


// 	}
// }


// {
// 	public static void main(String[] args) {
		
// 		Scanner sc = new Scanner(System.in);

// 		System.out.println("Enter a number: ");

// 		int num = sc.nextInt();

// 		for(int i=1; i<=10; i++)
// 		{
// 			System.out.println(i*num);
// 		}
// 	}
// }



{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int i = sc.nextInt();
		
		int num = 1;

		do{
			System.out.println(num*i);
			num++;
		}
		while(num<=10);
	}
}