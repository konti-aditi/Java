import java.util.Scanner;

class AreaOfCylinder
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius for cylinder(cm): ");
		double radius = sc.nextDouble();

		System.out.println("Enter the length of a cylinder(cm): ");
		double length = sc.nextDouble();

		//2 × π × r × (r + h)
		double area = 3.14*radius*radius;
		System.out.println("Area of cylinder is: " +area);

		double volume = area*length;
		System.out.println("volume of cylinder is: " +volume);

	}
	

}