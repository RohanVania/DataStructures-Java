package Array;
import java.util.*;

/*
 ** (Array has unique elements and are within 0<=nums[i]<=n
 *  Problem 1: Find missing number in an array
 *  	Approach 1: Sort the given array, and create a new array with numbers from [0,n]
 *  	Then, match elements from sorted array and new_array and the index where it doesn't match is the same index element which element
 *  	is missing in new_array;
 *		
 *	
 *		Aprroach 2:Store the [0,n] in hashmap and iterate the given array check if the value of the given array in hashmap if yes
 *		remove the key and value from hashmap, and in the last iterate hashmap and return just the lefover key value.
 *		(This Works because of array contains only elements in the rnage of this 0<=nums[i]<=n)
 *
 *		Approach 3: I got the intution for this approach using carefully reading the condition and optimizing the above approach one by one
 *		We known all elements are unique and array contains elements between the range 0 and n; and we have one missing element which 
 *		we can find by subtracting.
 *  	   
 *  Problem 2: Union of Two Sorted Array
 *  
 *  	Approach1: If add elements of array 1 in set and elements of array 2 in same set and we get the union, and since in the question 
 *  	then want it in sorted array, so to have a set that is sorted we have to use SortedSet Interface which is implemented by TreeSet
 *  	and the Time Complexity for Insertion is :O(nlogn), it uses a balanced tree
 *  
 *  	Approach 2: We can optimize the time complexity to O(n)
 *  	As in the question it is given the two array are sorted and we have to find union, we have using Two pointer Approach
 *  	Maintain two pointers in each array and keep checking and entering into the ArrayList as we dont known the count of
 *  	number of union elements present
 *  
 *  
 *  
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
	  
	 /* Approach 1 (Union of Two Sorted Array )*/
	  public static List< Integer > UnionOfTwoSortedArray(int []a, int []b) {
		 
		 SortedSet <Integer> s=new TreeSet<>();
		  ArrayList < Integer > Union=new ArrayList<>();
		  for (int i = 0; i < a.length; i++) {
			  s.add(a[i]);			  
		  }
		  for (int i = 0; i < b.length; i++) {			  
			  s.add(b[i]);
		  }
		  for (int it: s) {
			  Union.add(it);			  
		  }
		  return Union;
	  }
	        

	  
	  public static int findMaxConsecutiveOnes(int[] nums) {
	        int check = 0;
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == 0) {
	                arrlist.add(check);
	                check=0;
	            } else {
	                check++;
	            }
	        }
	        arrlist.add(check);
	        int maximum=0;
	          for (int i = 0; i < arrlist.size(); i++) {
	            if (maximum < arrlist.get(i))
	                maximum = arrlist.get(i);
	        }
	       
	    return maximum;
	  }
	
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int nums[]= {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));		
		
		
	}

}
