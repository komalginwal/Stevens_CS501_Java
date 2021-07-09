

/*
(The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
	* Two double data fields named width and height that specify the width and
		height of the rectangle. The default values are 1 for both width and height.
	* A no-arg constructor that creates a default rectangle.
	* A constructor that creates a rectangle with the specified width and height.
	* A method named getArea() that returns the area of this rectangle.
	* A method named getPerimeter() that returns the perimeter.

*/

import java.util.*;

public class C9E1RectangleClass {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Declaring data types
		double width, height;				//Parameters of rectangle object
		int repeat = 1;						//To allow user to continue testing
		Rectangle rect = new Rectangle();	//Rectangle object to test

		//Program description
		System.out.println("The following program allows you to test the 'Rectangle' "
						  +"class. ");
		System.out.println("You will enter values for width and height and see the "
						  +"perimeter and area of your Rectangle object\n");
		
		//Example of program function
		System.out.println("Example for rectangle with dimensions " + rect.toString());
		System.out.println("");
		rect.print();
		
		//Repeat loop for user testing
		while(repeat != 0)
		{
			//Prompt user input
			System.out.print("\nEnter the width: ");
			width = input.nextDouble();
			System.out.print("Enter the height: ");
			height = input.nextDouble();
			
			//Testing for valid input by user
			try {
				rect = new Rectangle(width,height);
				
				rect.print();
				System.out.println("\nEnter 0 to exit; any other integer to test another Rectangle");
				repeat = input.nextInt();
			} 
			catch(Exception e) {
				// if get here then setWidth() or setHeight() threw Exception e
				System.out.println(" - FAILED - " +
						"\nrect = new Rectangle(width,height);" +
						" threw Exception w/ message:\n" +
						e.getMessage());
				System.out.println("- TRY AGAIN - ");
				//Goes back to user input after message is printed
			}
		}
		input.close();

	}

}
