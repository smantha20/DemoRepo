package org.studyeasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppLambda {

	public static void main(String[] args) {
		int z = 10;//effectively final
		 
		 Lambda lambda = (int x, double y)->{
			 System.out.println("Stements x " + x + " and y " + y + " and z " + z );
		      return 90;
		 };		  
		 lambda.demo(20, 65.5);	 
		// Thread thread1 = new Thread( ()->System.out.println(" i am inside the run method " ));
		 //thread1.start();
		 new Thread (()->System.out.println(" i am inside the run method " )).start();
		 
		 List<DataLambda> list = new ArrayList<>();
		 list.add(new DataLambda("Sara"));
		 list.add(new DataLambda("Ed"));
		 list.add(new DataLambda("John"));
		 list.add(new DataLambda("Angelica"));
		 //Collections.sort(list, 
		 //(DataLambda o1, DataLambda o2)->o1.getName().compareTo(o2.getName()));
		 Collections.sort(list, 
				 (DataLambda o1, DataLambda o2)->{ 
					if( o1.getName().length() ==  o2.getName().length()){						
						return 0;
					}else if(o1.getName().length() > o2.getName().length()){
						return 1;
					}else{
						return -1;
					}
					 });
			 
		 //for (DataLambda data: list) {
		//	 System.out.println(data.getName());
		// } 
		 
		 list.forEach(str->System.out.println(str.getName()));

		 //*************************************************************************
		    boolean print = true;
		    List<String> list1 = new ArrayList<>();
			list1.add("one");
		    list1.add("two");
			list1.add("three");
			list1.add("four");
			list1.forEach(i->{			
				if(print){
		    	  System.out.println("list values " +i);
				}  
		    }
			);
			
		 //***************************************************************************
		 
	}
	

}
interface Lambda{
	public  int demo(int x, double y);		 
	 
}
class DataLambda{
	private String name;

	public DataLambda(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "DataLambda [name=" + name + "]";
	}
	
}
