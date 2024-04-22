package Array;

import java.util.Arrays;

/*
 * Problem 1: Remove Duplicates from Array in O(1) space 
 * Problem 2: Left Rotate Array by One place
 * Problem 3: Linear Search Find an element in array the array can be in any order
 * 
 */




public class Day2 {
	
	/* Linear Search Find a number in array and array can be in any order*/
	
	public static int LinearSearch(int []arr,int n,int num) {
		for(int i=0;i<n;i++) {
			if(arr[i]==num)return i;
		}
		return -1;
	} 
	
	/*Left Rotate Array by one place*/
	public static int[] leftRotateArrayByOnePlace(int[]arr,int n) {
		if(n==1) {
			return arr;
		}
		int temp=0;
		for(int i=0;i<n-1;i++) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
		return arr;
	}
	
	/* Array should be sorted */
	/* Two Pointer Approach keep track of one that is same and swap*/
	public static int NumberofUniqueElements(int[] arr,int n) {
		int count=1;
        if(n==1){
            return count;
        }
        
        int p1=0;
        for(int i=0;i<n;i++){
            if( arr[p1]!=arr[i]){
               arr[++p1]=arr[i];
                count++;
            }
        }

        return count;
        
	}
	

	public static void main(String[] args) {
		int []arr= {1,2,2,2,3,4,56,56};
		int result=NumberofUniqueElements(arr, arr.length);
		System.out.println(result);
		int []arr1= {1,2,2,2,3,4,56,93};
		int []resultArr=leftRotateArrayByOnePlace(arr1, arr1.length);
		System.out.println(Arrays.toString(resultArr));
		int []checkElements= {1,23,4,2,1,90,89};
		int result2=LinearSearch(checkElements,checkElements.length , 90);
		System.out.println(result2);
		

}
}
