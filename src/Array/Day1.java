package Array;

import java.util.Arrays;

/*
 * Problem 1: Largest Element in Array in o(n) 
 * Problem 2: Second Largest and Second Smallest Element in Array in O(n)
 * Problem 3: Check if the Array is Sorted
 * 
 */

public class Day1 {
	
    /* Largest Element in Array Function */	
	public static int LargestElementInArray(int []arr) {
		int largest=arr[0];
		if (arr.length==1) {
			return largest;
		}
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		return largest;
	}
	
	public static int[] SecondLargestAndSecondSmallestElementInArray(int []a,int n) {
		int largest=a[0];
        int smallest=a[0];
        int secondLargest=Integer.MIN_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }else{
                if(a[i]>secondLargest && a[i]<largest){
                    secondLargest=a[i];
                }
            }

            if(a[i]<smallest){
                secondSmallest=smallest;
                smallest=a[i];
            }
            else{
                if(a[i]<secondSmallest && a[i]>smallest){
                    secondSmallest=a[i];
                }
            }

        }
        int []ar={secondLargest,secondSmallest};
        return ar;
		
	}
	
	public static boolean checkSorted(int []a,int n) {
		if(n==1){
            return true;
        }
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]) return false;
        }
        return true;
	}
	
	public static void main(String[] args) {
		int []arr= {1,2,321,4,5};
		int result=LargestElementInArray(arr);
		System.out.println(result);
		int []resultAr=SecondLargestAndSecondSmallestElementInArray(arr, arr.length);
		System.out.println(Arrays.toString(resultAr));
		
		boolean checkSortedResult=checkSorted(arr, arr.length);
		System.out.println("Check if Sorted =>"+ checkSortedResult);
		
		
		
			
		
		
		
	}

}
