
/* Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle.
*/
import java.util.Scanner;

public class C3E27InsideTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //SCanner object is defined as 'sc'
		
		// Prompt the user to enter a point with x and y coordinates
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // Get the intersecting point with the hypotenuse side of the triangle
        // of a line that starts and points (0, 0) and touches the user points
        
        double intersect_x = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersect_y = (-y * (200 * 100)) / (-y * 200 - x * 100);

        // Display results
        System.out.println("The point " + ((x > intersect_x || y > intersect_y)
                ? "is not " : "is ") + "in the triangle");

		
	}

}