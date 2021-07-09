

import java.util.GregorianCalendar;
public class C9E5GregorianCalender {

	public static void main(String[] args) {
		
		
		
				String[] months = {"January", "February", "March", "April", "May", "June", "July",
								   "August", "September", "October", "November", "December"};
				
				
				final long TIME = 1234567898765L;					//Time elapsed in milliseconds since Jan 1, 1970
				GregorianCalendar date = new GregorianCalendar();	//Initialize to current date
				
				//Program Description
				System.out.println("The follwing program shows you the current date");
				System.out.println("Then it shows the date after an elapsed time of "+
								   "\n1234567898765 milliseconds starting at Jan 1, 1970\n");
				
				//Display current date
				System.out.println("Current Date:");
				
				System.out.println("\nMonth: " + months[date.get(GregorianCalendar.MONTH)]);
				System.out.println("Day: " + date.get(GregorianCalendar.DAY_OF_MONTH));
				System.out.println("Year: " + date.get(GregorianCalendar.YEAR));
				
				//Set time to 1234567898765 milliseconds past Jan 1, 1970
				date.setTimeInMillis(TIME);
				
				//Display new date from elapsed time
				System.out.println("\nDate 1234567898765 milliseconds after 1/1/1970:");
			
				System.out.println("\nMonth: " + months[date.get(GregorianCalendar.MONTH)]);
				System.out.println("Day: " + date.get(GregorianCalendar.DAY_OF_MONTH));
				System.out.println("Year: " + date.get(GregorianCalendar.YEAR));
				

	}

}
