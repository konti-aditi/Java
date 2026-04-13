import java.util.Scanner;

class FiboDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        while (num > 0) {
            int digit = num % 10;

            int n1 = 0, n2 = 1;
            boolean isFibo = false;

            // using for loop instead of method
            for (; n1 <= 8; ) {
                if (n1 == digit) {
                    isFibo = true;
                    break;
                }

                int ans = n1 + n2;
                n1 = n2;
                n2 = ans;
            }

            if (isFibo) {
                System.out.println(digit + " is a Fibonacci digit");
            } else {
                System.out.println(digit + " is NOT a Fibonacci digit");
            }

            num = num / 10;
        }
    }
}