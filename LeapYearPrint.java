import java.util.Scanner;

class LeapYearPrint
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start year: ");
        int start = sc.nextInt();

        System.out.println("Enter end year: ");
        int end = sc.nextInt();

        int year = start;

        System.out.println("Leap years present are:");

        while (year <= end) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year);
            }
            year++;  
        }
    }
}
