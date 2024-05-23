package Concepts;

public class HashTable {
	
	Employee [] hashTable;
	
	public HashTable() {
		hashTable=new Employee[10];
	}
	
	public int hashCode(String lastname) {
		return lastname.length() % hashTable.length;
	}
	
	public void put(String key,Employee e) {
		 int index=hashCode(key);
		 if(hashTable[index]!=null) {
			 System.out.println("Sorry we cannot store and we have not implemented anything to handle collision");
		 }else {			 
			 hashTable[index]=e;
		 }
	}
	
	public Employee get(String key) {
		int index=hashCode(key);
		return hashTable[index];
	}
	
	public void printHashTable() {
		for(int i=0;i<hashTable.length;i++) {
			System.out.println(hashTable[i]);
		}
	}
	
	
	

}
