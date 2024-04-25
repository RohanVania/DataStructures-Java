package Array;

import java.util.Arrays;

/*
 * 
 *  Problem 1: Left rotate an array by D places
 *  	Approach 1:
 *  	Approach 2:
 *  	Approach 3:
 *  
 *  Problem 2: Right rotate an array by D places
 *  
 *  Problem 3: Move Zeroes to the end
 *  
 *  Problem 4: Linear Search
 *  
 *  
 */


public class Day3 {
	/*Problem 4*/
	 public static int linearSearch(int n, int num, int []arr){
	        // Write your code here.
	        for(int i=0;i<n;i++){
	            if(arr[i]==num) return i;
	        }
	        return -1;
	    }
	
	public static int [] leftRotateByDPlaces(int[]arr,int n,int k) {
		int temp=0;
		for(int j=0;j<k;j++) {
			for(int i=0;i<n-1;i++) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		
		return arr;
	}

	 public static int [] moveZeroes(int[] nums) {
	        int []new_array=new int[nums.length];
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!=0){
	                new_array[count]=nums[i];
	                count++;
	            }
	        }
	        return nums=new_array;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {5,6,7,8};
		int []res=leftRotateByDPlaces(arr,arr.length, 3);
		
		System.out.println(Arrays.toString(arr));
		
		int []nums= {0,1,0,3,12};
		System.out.println(Arrays.toString(nums));
		nums=moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

}
