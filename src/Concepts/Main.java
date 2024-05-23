package Concepts;

import java.util.Arrays;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {1,10,20,20,10,10,20,5,20};
		HashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				
				map.put(arr[i], 1);
			}
		}
		
		map.forEach((k,v)->System.out.println(k+" =>"+v));
		
		Employee e1=new Employee (1233,"Rohan","Vania");
		Employee e2=new Employee (1235,"jan","doe");
		Employee e3=new Employee (1236,"does","john");
		Employee e4=new Employee (1237,"vipuljuye","jetha");
		Employee e5=new Employee (1238,"drashti","hiasdik");

		HashTable ht=new HashTable();
		ht.put("Rohan", e1);
		ht.put("jan", e2);
		ht.put("does", e3);
		ht.put("vipuljuye", e4);
		ht.put("drashti", e5);
	
		
		ht.printHashTable();
		Boolean b[]=new Boolean[5];
		Arrays.fill(b, false);
		for(boolean b1:b) {
			System.out.println(b1);
		}
		
		System.out.println("Retrievel is =>"+ht.get("Rohan"));
		
	int i=12;
	System.out.println(Integer.toBinaryString(i));
		
		
	}

}
