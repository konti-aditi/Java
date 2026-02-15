import java.util.Scanner;

class CalculatorSwitch{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		double num1 = sc.nextDouble();
		System.out.print("Enter num2 : ");
		double num2 = sc.nextDouble();


		System.out.println("Enter an operator: ");
		char op = sc.next().charAt(0);

		solve (num1, num2, op);

	}

	public static void solve(double num1, double num2 , char op)
	{
		double output = 0;
		switch (op){
		case '+' : {
			output = num1+num2;
			break;
		}
		case '-'{
			output = num1-num2;
			}
		case '*'{
			output = num1*num2;
		}
		case '/'{
			output = num1/num2;
		}

		case '%'{
			output = num1%num2;
			break;
		}
		default: {
			System.out.println("invalid operator");
			break;

		}


		}
		System.out.println(num1+" "+op+" "+num+" = "+output);

	}

	
}


