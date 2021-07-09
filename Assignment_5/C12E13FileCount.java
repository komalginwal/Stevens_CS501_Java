




import java.io.File;
import java.util.Scanner;
//import javax.swing.JFileChooser;
//import javax.swing.filechooser.FileNameExtensionFilter;




public class C12E13FileCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Data members
		int repeat = 1;
		String fileName = "test.txt";
		myFile exampleFile = new myFile();

		//Program Description
		System.out.println("The following program allows you to the name of a '.txt' file");
		System.out.println("and allows shows you a count of the total number of characters (not whitespace), "
						 + "\nwords, and lines in the file\n");
		
		//Example of program function
		System.out.println("Example of statistics for given 'test.txt' file");
		try {
			exampleFile = new myFile(fileName);
			exampleFile.print();
		}
		catch(Exception e) {
			System.out.println(" - FAILED - " +
					"\nexampleFile = new FileStats(filename);" +
					"\nthrew Exception w/ message:\n" +
					//exampleFile.getErrorMessage());
					e.getMessage());
		}
		
		//Repeat loop for user testing
		while(repeat != 0)
		{
			//Prompt user input
			System.out.print("\nEnter the file name (including .txt extension): ");
			fileName = input.next();
			
			//Testing for valid input by user
			try {
				exampleFile = new myFile(fileName);
				exampleFile.print();
				System.out.print("\nEnter 0 to exit, any other integer to go again: ");
				repeat = input.nextInt();
			}
			catch(Exception e) {
				System.out.println(" - FAILED - " +
						"\nexampleFile = new FileStats(filename);" +
						"\nthrew Exception w/ message:\n" +
						//exampleFile.getErrorMessage());
						e.getMessage());
				System.out.println("- TRY AGAIN - ");
				//Goes back to user input after message is printed
			}
		}// end while
		
	}//end main

}//end class