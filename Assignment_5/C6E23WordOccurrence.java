

//Occurrences of a specified character) Write a method that finds the number of
//occurrences of a specified character in a string using the following header:
//public static int count(String str, char a)
//240 Chapter 6
//Methods
//For example, count("Welcome", 'e') returns 2. Write a test program that prompts the user to enter a string followed by a character and displays the number of occurrences of the character in the string.



//Occurrences of a specified character) Write a method that finds the number of
//occurrences of a specified character in a string using the following header:
//public static int count(String str, char a)
//240 Chapter 6
//Methods
//For example, count("Welcome", 'e') returns 2. Write a test program that prompts the user to enter a string followed by a character and displays the number of occurrences of the character in the string.

import java.util.Scanner;

public class xyz {
	/** Main Method */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program Description: A method that finds the number "
				+ "of occurrences of a specified character in a string ");
		
		
		int repeat = 1;
		
		while(repeat !=0 ) {
				int yes = 1;
				
				
				
				// Prompt the user to enter a string followed by a character as mentioned
				System.out.println("Enter a string followed by a character e.g. Welcome, e : " );
				
				String string = input.nextLine();

				// Extract character and substring
				int k = string.indexOf(", ");
				String str = string.substring(0, k);
				char ch = string.charAt(k + 2);

				// Display the number of occurrences of the character in the string
				System.out.println("The number of occurrences of \"" + ch + "\" in \'" + str 
						+ "\" is: " + count(str, ch));
				
				// Nested loop to test for multiple character occurrences
				
				while(yes !=0) {
					
				System.out.println("Enter 0 to exit or any other integer to know "
						+ "occurence of different character.");
				
				yes = sc.nextInt();
				if(yes ==0) {
				break;
				}
				System.out.println("Enter the character: ");
				
				String s = input.nextLine();
				char c = s.charAt(0);
				System.out.println("The number of occurrences of \"" + c + "\" in \'" + str + "\" is: " + count(str, c));
				
				}
				
				//Want to go again?
				System.out.println("Press 0 to exit and any other integer to continue "
						+ "with different string.");
				
				repeat = sc.nextInt();
		}
	}

	/** Method count */
	public static int count(String str, char a) {
		int count = 0; // Initialize count to 0

		// Count the number of occurrences of the character a in the string str
		for (int i = 0; i < str.length(); i++) {
			if (a == str.charAt(i))
				count++;
		}
		return count;
	}
}