

/*
 * Program Descriptions : Program prompts the user to enter ten numbers, 
 * invokes "min" and "indexOfSmallestElement" method to return the minimum value, and 
 * displays the minimum value along with its Index.
 * 
 * Also, program reads in ten double numbers, invokes the "reviseSelectionSort" method, 
 * and displays the sorted numbers.
 */
import java.util.Scanner;


public class C7E9Arrays_sort {
	

	public static int indexOfSmallestElement(double[] arr){     // Method to find index of minimum element in array
		double min = arr[0];
		int index = 0;
		for (int i = 1; i < 10; i++){
			if(arr[i] < min){
				min = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	public static double min(double[] arr){                     // Method to find minimum element in array
		double min = arr[0];
		for (int i = 1; i < 10; i++){
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	public static void revisedSelectionSort(double[] list)    // Method to sort array in descending order using Selection sort
    { 
        int n = list.length; 
  
        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (list[j] > list[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first element
            
            double temp = list[min_idx]; 
            list[min_idx] = list[i]; 
            list[i] = temp; 
        } 
        
        System.out.print("\nSorted Array: ");
		for(int i = 0; i < list.length; i++ ){
			System.out.print(list[i]+" ");
		}
    } 
	
	public static void main(String[] args) {
		
		System.out.println("\nThe program prints the smallest element and it's index, and then sorts the array by a revised selection sort.");
		System.out.println("\nEnter 10 numbers separated by spaces:");
		
		double [] arr = new double [10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextDouble();
		System.out.println("\nThe smallest number is: " + min(arr) + " and it's index is: " + indexOfSmallestElement(arr));
	
		revisedSelectionSort(arr);
//		
			
			
		
		
//7.1 2.3 3.4 2.0 4.5 1.0 4.2 3.8 6.8 1.1
	}

}
	
