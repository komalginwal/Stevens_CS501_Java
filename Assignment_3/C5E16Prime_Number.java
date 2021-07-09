
/* Chapter: 5 and 6 <br />
   Exercise: 5.16, 5.20 and 6.10 
   
   Program Description : A program show the first 50, then populate an array containing the prime numbers less than 1000, 
   and in a repeat loop ask the user to enter one number at a time to test if it is prime  by searching the array.  
   If not show its factors.  
   
   USed isPrime Method for testing whether a number is prime.
*/

import java.util.Scanner;

public class C5E16Prime_Number {
	
	/* Program to check whether the number is prime or not, it returns a boolean value */
	
	private static boolean isPrime(int num) {
        if (num < 2) 
			return false;
        if (num == 2) 
			return true;
        if (num % 2 == 0) 
			return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) 
            	return false;
        return true;


	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Program Description
		
		System.out.println("\nThis program allows you check if a number (less than 1000) is a prime number.");
		System.out.println("\nIf your number is not prime, the program will display its prime factors in ascending order");
		System.out.println("\nThe first 50 prime numbers (2 -> 229) are printed below: \n");
		
		// Prints first 50 prime numbers
		
		int [] primes = new int [200];
		primes[0] = 2;
		System.out.print("2 ");
	
		int count = 1;
		for(int i = 3; i < 1000; i+= 2){
			if(isPrime(i)){
				if(count <= 49)
					
					System.out.print(i + " ");
					
				if(count <= 199){
					primes[count] = i;
					count++;}
				
				
			}
		}
		
		//Check prime numbers and display prime factors
		
		int repeat = 1;
		int n;
		while (repeat !=0) {
			
			
			System.out.println("\nEnter a number (1 < n < 1000) to check if it is prime: ");           //Prompt user input
			n = sc.nextInt();
			
			
			if(isPrime(n))
				System.out.println(n + " is Prime. ");
			else if(n <= 0){}
			else if(n == 1){
				System.out.println("1 is not Prime. ");
			}
			else{
				System.out.print(n + " is not Prime. The Prime Factors of " + n + " are: ");	
					while(!isPrime(n)){
						int i;
						for (i = 0; n % primes[i] != 0; i++){}
						n = n / primes[i];
						System.out.print(primes[i] + " ");					
					}
					System.out.println(n);
				
			}
			
			System.out.print("\nEnter 0 to exit, any other integer to try again: ");               //Prompt user input for another search
			repeat = sc.nextInt();
		}
		sc.close();
	}
	

}
