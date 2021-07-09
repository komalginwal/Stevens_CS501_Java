//Program to calculate distance between two points


import java.util.Scanner; // Import Scanner class

public class C2E15DistanceFormula {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner object 'sc' created
		
		// Prompt the user to enter x1 and y1
		System.out.print("\n Enter x1 and y1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		//Prompt user to enter x2 and y2
		System.out.print("\n Enter x2 and y2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		//Calculate the distance between two points
		double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2),0.5);
		
		//Display Result
		System.out.println("The distance between two points is: "+distance);

	}

}