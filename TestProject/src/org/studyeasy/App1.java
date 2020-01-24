package org.studyeasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


class Names implements Comparable<Names>{
	String name;
	public Names(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Names obj) {
		if(name.length() == obj.name.length()){ 
			return 0;			
		}else if(name.length() > obj.name.length()){ 
		   return 1;
		}else{
			return -1;
		}
	}

	@Override
	public String toString() {
		return  name  ;
	}

	
	
}

public class App1 {

	public static void main(String[] args) {
		List<Names> names = new ArrayList<>();
		names.add(new Names("Chaand"));
		names.add(new Names("Ed"));
		names.add(new Names("John"));
		names.add(new Names("Mia"));
		
		App1 app = new App1();
		app.printList(names);		
		Collections.sort(names);
		System.out.println("******************");
		app.printList(names);
		Collections.reverse(names);
		System.out.println("******************");
		app.printList(names);
	}
	void printList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
