package org.studyeasy;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class DataCompare<K,V>{
	
	private K key;
	private V value;
	
	public DataCompare(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	
}

public class AppCompare {

	public static void main(String[] args) {
		Comparator <DataCompare<Integer, String>> COMPARE_KEY = new Comparator<DataCompare<Integer, String>>(){

			@Override
			public int compare(DataCompare<Integer, String> arg0, DataCompare<Integer, String> arg1) {
			    if(arg0.getKey() < arg1.getKey()){
			    	return -1;
			    }else if(arg0.getKey() > arg1.getKey()){
			    	return 1;
			    }else{
				  return 0;
			    } 
			}
			
		};
		
		Comparator <DataCompare<Integer, String>> COMPARE_KEY1 = new Comparator<DataCompare<Integer, String>>(){

			@Override
			public int compare(DataCompare<Integer, String> arg0, DataCompare<Integer, String> arg1) {
			    if(arg0.getValue().length() < arg1.getValue().length() ){
			    	return -1;
			    }else if(arg0.getValue().length()  > arg1.getValue().length() ){
			    	return 1;
			    }else{
				  return 0;
			    } 
			}
			
		};
		Set<DataCompare<Integer, String>> lSet = new TreeSet<>(COMPARE_KEY1);	 
		lSet.add(new DataCompare<Integer, String>(1, "Arnold"));
		lSet.add(new DataCompare<Integer, String>(9, "Chaand"));
		lSet.add(new DataCompare<Integer, String>(5, "Ed"));
		lSet.add(new DataCompare<Integer, String>(2, "Mia"));
		lSet.add(new DataCompare<Integer, String>(5, "Chaand"));
	
		 
		for(DataCompare<Integer, String> element: lSet){
			System.out.println(element);
		}
	}

}
