
/*
The great circle distance is the distance between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) 
be the geographical latitude and longitude of two points.


Here is a sample run:
	Enter point 1 (latitude and longitude) in degrees: 39.55 -116.25
	Enter point 2 (latitude and longitude) in degrees: 41.5 87.37
	The distance between the two points is 10691.79183231593 km

*/

import java.util.*;
import java.lang.Math;  ////Include Math library for toRadians, sin, cos, and arccos

public class C4E2GreatCircleDistance {


	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //Scanner object 'sc' is created
		int flag = -1;
		
		while(flag < 0)
		{
			//Prompt user to enter latitude and longitude of point 1
			
			System.out.print("\n Enter point 1 (latitude and longitude) in degrees:");
			
			double x1_Degree = sc.nextDouble();
			double y1_Degree = sc.nextDouble();
			
			////Prompt user to enter latitude and longitude of point 2
			
			System.out.print("\n Enter point 2 (latitude and longitude) in degrees:");

			double x2_Degree = sc.nextDouble();
			double y2_Degree = sc.nextDouble();
			
			final double RADIUS = 6371.01;  //The average earth radius is 6,371.01 km. 
			
			//convert the degrees into radians using the Math.toRadians method 
			
			double x1 = Math.toRadians(x1_Degree);
			double y1 = Math.toRadians(y1_Degree);
			double x2 = Math.toRadians(x2_Degree);
			double y2 = Math.toRadians(y2_Degree);
			
			/*The great circle distance between the two points can be computed using the following formula:

				d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))*/
			
			
			double d = RADIUS * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
			
			System.out.println("\n The distance between the two points is "+d+" km");

			System.out.print("\nEnter 1 for try again and 0 for exit: ");
			int get = sc.nextInt();
			
			if(get == 0)
			{
				flag++;
				System.out.println("\t Thank You");
			}
		}
		
		

	}

}
