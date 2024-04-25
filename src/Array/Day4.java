package Array;
import java.util.*;

/*
 ** (Array has unique elements and are within 0<=nums[i]<=n
 *  Problem 1: Find missing number in an array
 *  	Approach 1: Sort the given array, and create a new array with numbers from [0,n]
 *  	Then, match elements from sorted array and new_array and the index where it doesn't match is the same index element which element
 *  	is missing in new_array;
 *
 *		Aprroach 2:Store the [0,n] in hashmap and iterate the given array check if the value of the given array in hashmap if yes
 *		remove the key and value from hashmap, and in the last iterate hashmap and return just the lefover key value.
 *
 *		Approach 3: I got the intution for this approach using carefully reading the condition and optimizing the above approach one by one
 *		We known all elements are unique and array contains elements between the range 0 and n; and we have one missing element which 
 *		we can find by subtracting.
 *  	   
 *  Problem 2: Union of Two Sorted Array
 *  Problem 3: Intersection of Two Sorted Array
 *  
 *  
 *  
 *  
 */


public class Day4 {
	
	/*Approach 1 (Missing Number in array)*/
	  public int missingNumberApproach1(int[] nums) {
	        Arrays.sort(nums);
	        int new_arr[]=new int[nums.length+1];
	        for(int i=0;i<new_arr.length;i++){
	            new_arr[i]=i;
	        }
	            System.out.println(Arrays.toString(nums));
	            int j;
	        for(j=0;j<nums.length;j++){
	            if(nums[j]!=new_arr[j]) return new_arr[j];
	        }

	        return new_arr[j];
	        
	    }
	
	/*Approach 2 (Missing Number in array)*/
	  public int missingNumberApproach2(int[] nums) {

	        HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();

	        for(int i=0;i<=nums.length;i++){
	            hashmap.put(i,i);
	        }

	        for(int i=0;i<nums.length;i++ ){
	            if(hashmap.containsKey(nums[i])) {
	                hashmap.remove(nums[i]);
	            }
	        }

	      

	        for(Map.Entry<Integer,Integer> entry:hashmap.entrySet()){
	            return entry.getKey();
	        }

	        return 1;
	        
	    }
	
	/*Approach 3 (Missing Number in array)*/
	public int missingNumberApproach3(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length;i++){
            sum=sum+i;
        }
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum2=sum2+nums[i];
        }
        return sum-sum2;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
