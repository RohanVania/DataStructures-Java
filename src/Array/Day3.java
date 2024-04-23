package Array;

import java.util.Arrays;

/*
 * 
 *  Problem 1: Left rotate an array by D places
 * 
 */


public class Day3 {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {5,6,7,8};
		int []res=leftRotateByDPlaces(arr,arr.length, 3);
		
		System.out.println(Arrays.toString(arr));

	}

}
