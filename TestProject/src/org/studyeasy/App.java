package org.studyeasy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.studyeasy.demo.Outer;
import org.studyeasy.testrun.TestStatic;

class UserDefinedException extends Exception{
	
}

public class App {

	public static void main(String[] args) {
	 
	 /*  System.out.println("Current variable value: "+TestStatic.getStaticVariable());
	   TestStatic.setStaticVariable(1);
	   System.out.println("Current variable value: "+TestStatic.getStaticVariable());
	   TestStatic.setStaticVariable(24);
	   System.out.println("Current variable value: "+TestStatic.getStaticVariable());
	   
	   Outer.testOuterMethod();
		
	   B obj1= new B(5);
	   System.out.println(obj1.getX());*/
		B obj1= new B(12);
		obj1.india(); 
		int x = 0;
		
		try{
			someMethod();
		    System.out.println("We don't know, what will be the outcome "+x/0);
			
		}catch(FileNotFoundException e){
			System.out.println( "file not found " +e.getMessage());
			
		}	catch(UserDefinedException e){
				System.out.println("UserDefinedException");	
				e.getStackTrace();
		
		}catch(Exception e){
			System.out.println(e.getMessage());			   
		 
	   }
		
	    finally{
	    	System.out.println("This will be get printed");
		    System.out.println();
	    } 
		
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		Collections.sort(countries);
		new App().printListUsingListItr(countries);
		 System.out.println("**************** " );
		Collections.reverse(countries);
		new App().printListUsingListItr(countries);
		
		
		
		
		
		
		
	}
	/*void printList(List<String> list){
   	 
    	 Iterator<String> iterator = list.iterator();
    	 while(iterator.hasNext()){
    		 System.out.println("Element: "+iterator.next());
    	 }
     }*/ 
	 
	void printListUsingListItr(List<String> list){
	   	 
    	ListIterator<String> iterator = list.listIterator();
    	 while(iterator.hasNext()){
    		 System.out.println("Element: "+iterator.next());
    	 }
     } 
	public static void someMethod() throws Exception, FileNotFoundException{
		 int x = 3;
		 
		 switch(x){
		 case 1: throw new FileNotFoundException();
		         
		 case 2 : throw new Exception();        
		 
		 default: throw new UserDefinedException();
		 }
	}	
	public static void someMethod1() throws FileNotFoundException{
		 
		FileReader in = new FileReader("file.txt");
		 
		throw new FileNotFoundException();
		 
	}	
	

	

}
