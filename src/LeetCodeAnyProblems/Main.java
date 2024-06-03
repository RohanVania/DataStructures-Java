package LeetCodeAnyProblems;



/*
 * 1. Merge Two Sorted Array 
 *    (Type 1: We are returning the Resultant Array)
 *	  (Type 2: nums1 will be of length m+n and we want resultant in same array nums1 without returning anything )
 *
 * 2. Remove Element 
 *    Problem Description: Given an integer Array nums and an integer val,remove all occurrence of val in nums in-place. The order may be changed
 *    Then return the number of elements in nums which are not equal to val
 *
 */

class Problems{
	
	// Merge Two Sorted  Type 1 
	public static int[] mergeSortedArray(int [] nums1, int [] nums2) {
	    int m=nums1.length;
	    int n=nums2.length;
		int newArray[]=new int[m+n];
	     
	      int i=0;
	      int j=0;
	      int c=0;
	      while(i<m && j<n){
	        if(nums1[i]<=nums2[j]){
	            newArray[c]=nums1[i];
	            i++;
	            c++;
	        }else{
	            newArray[c]=nums2[j];
	            j++;
	            c++;
	        }
	      }

	      while(i<m){
	        newArray[c]=nums1[i];
	        i++;
	        c++;
	      }

	      while(j<n){
	newArray[c]=nums2[j];
	        j++;
	        c++;
	      }
	       
	        return nums1=newArray;
	        
	    }
	
		
	// Merge Two Sorted Array Type 2
    public static void mergeTwoSortedInSameArray(int[] nums1, int m, int[] nums2, int n) {
   
	    int i=m-1;
	    int j=n-1;
	    int k=m+n-1;
	    while(j>=0){
	        if(i>=0 && nums1[i]>=nums2[j]){
	            nums1[k]=nums1[i];
	            i--;
	            k--;
	        }
	        else{
	            nums1[k]=nums2[j];
	            j--;
	            k--;
	        }
	
	    }
	    
	 }
		
   //2. Remove Element
   public static int removeElement(int[] nums, int val) {
        int i=0;
        int s=nums.length-1;
        int c=0;
        while(i<=s){
          if(nums[i]==val){
              int temp=nums[i];
              nums[i]=nums[s];
              c++;
              s--;
          }
          else{
              i++;
          }
        }

          return nums.length-c;

      }

}


public class Main {
	

	public static void main(String[] args) {
	
		int nums1[]= {4,5,8};
		int nums2[]= {5,6,7};
		nums1=Problems.mergeSortedArray(nums1,nums2);
		for(int i:nums1) {
			System.out.print(i);
		}
		
	}


}
