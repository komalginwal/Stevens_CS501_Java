/*
(Algebra: solve 2 * 2 linear equations) 
A linear equation can be solved using
Cramer’s rule . A  program that prompts the user to enter a, b, c, d, e, and f 
and displays the result. If ad - bc is 0, report
by printing “The equation has no solution.”
*/


import java.util.Scanner;

public class C3E3LinearEquationCramer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner object 'sc' is created
		
			double a,b,c,d,e,f;
			double x = 0, y = 0;
			int flag = 1;
			
			while(flag == 1)
			{
				//Prompt Program description
				System.out.println("The following program is to solve 2x2 linear equation using Cramer's Rule: ");
				System.out.println("\t ax + by = e"); 
				System.out.println("\t cx + dy = f");
				
				//Prompt user to input values of a,b,c,d,e,f
				System.out.print("\n Enter values of a,b,c,d,e,f: ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				d = sc.nextDouble();
				e = sc.nextDouble();
				f = sc.nextDouble();
				
				//Echo input back to the user
				System.out.println("\n Your two equations are as follows: ");
				System.out.println("\t "+a+"x + "+b+"y = "+e); 
				System.out.println("\t "+c+"x + "+d+"y = "+f);
				
				//Check if equations have a solution (avoid dividing by 0)
				if((a * d - b * c) != 0)
				{
					x = (e * d - b * f) / (a * d - b * c);
					y = (a * f - e * c) / (a * d - b * c);
					System.out.println("\n Results:");
					System.out.println("\t x is "+x + " and y is "+y);
					
				}
				else
				{
					System.out.println("The equation has no solution! ");
				}
				//Asking user if they want to go again
				System.out.println("\n Would you like to do another? Enter 1 for 'Yes' and 0 for 'No'");
				flag = sc.nextInt();
				
			}
		

	}

}
