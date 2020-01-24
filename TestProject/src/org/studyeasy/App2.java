package org.studyeasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class TestNames  {
	String name;
	public TestNames(String name){
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return name;
	}


	public String getName() {
		return name;
	}
 
	}
public class App2 {

	public static void main(String[] args) {
		List<Object> elements = new ArrayList<>();
		elements.add(new TestNames("Chaand"));
		elements.add(new TestNames("Ed"));
		elements.add(new TestNames("John"));
		elements.add(new TestNames("Mia"));
		elements.add(new TestNames("Some thing"));
		elements.add( 1);
		elements.add( 2.0);
		App2 app = new App2();
		app.printList(elements);
		 
	}
	
	void printList(List<Object> list) {
		ListIterator<Object> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
