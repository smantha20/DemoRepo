package org.studyeasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T  extends Comparable> implements Comparable<T>{
	private T myVariable;

	public Data(T myVariable) {
		super();
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}

	@Override
	public int compareTo(T o) {
		 
		return getMyVariable().compareTo(o);
	}
	
}

class GenericClass<T>{
		private T variable;

		public GenericClass(T variable) {
			this.variable = variable;
		}

		@Override
		public String toString() {
			return "GenericClass [variable=" + variable + "]";
		}

		public T getVariable() {
			return variable;
		}
		
	}
class Data1{
	public <E> void printListData(List<E> list){
		for (E element: list){
			System.out.println(element);
		}
	}
	public <E> void printArrayData(E[] arrayData){
		for (E element: arrayData){
			System.out.println(element);
		}
	}
}
	 
	public class AppComparable {

		private static GenericClass<Integer> test;

		public static void main(String[] args) {	
			Data<Integer> dataInt = new Data<Integer>(5);
			System.out.println(dataInt.compareTo(2)); 
			GenericClass<String> genericData = new GenericClass<String>("Some data");
			String data = genericData.getVariable();
			System.out.println(data); 
			List<Data<String>> elements = new LinkedList<>();
			elements.add(new Data<String>("Some text"));
			elements.add(new Data<String>("one"));
			elements.add(new Data<String>("two"));
			elements.add(new Data<String>("three"));
			elements.add(new Data<String>("four"));
			
			AppComparable app = new AppComparable();
			app.printList(elements);
	 
			List<Integer> list= new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			Data1 data1= new Data1();
			data1.printListData(list);
			
			List<String> list1= new ArrayList<>();
			list1.add("one");
			list1.add("two");
			list1.add("three");
			list1.add("four");
			 
			data1.printListData(list1);
			
			String[] stringArray = {"one","two","three","four"};
			data1.printArrayData(stringArray);
			
			Data<Integer> data3 = new Data<Integer>(2);
			System.out.println(data3.compareTo(1));
 
		}	
		
		void printList(List<Data<String>> list) {
			ListIterator<Data<String>> iterator = list.listIterator();
			while (iterator.hasNext()) {
				System.out.println("Element: " + iterator.next().getMyVariable() );
			}
		}
	}

 