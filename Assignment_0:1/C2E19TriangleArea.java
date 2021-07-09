import java.util.Scanner;

public class C2E19TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		//Prompt user to enter x1 and y1
		System.out.print("Enter three points of triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		//Calculate the area of triangle
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		//Display result
		System.out.println("The area of triangle is: "+area);
		
// 1.5 -3.4 4.6 5 9.5 -3.4
	}

}