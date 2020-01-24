package org.studyeasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingQueue;

public class AppCollections {

	public static void main(String[] args) {
	 
		Set<String> set = new HashSet<String>();
		set.add("Brad");
		set.add("Sara");
		set.add("Sara"); 	
		set.add("Murthy");
		//set.add(null);
		 
		for(String name :set){
			System.out.println(name);
		}
		System.out.println("********************");
		
		Set<String> lSet = new LinkedHashSet<String>();
		
		lSet.add("Sara");
		lSet.add("Sara"); 	
		lSet.add("Murthy");		
		lSet.add(null);
		lSet.add("Brad");
		 
		for(String name :lSet){
			System.out.println(name);
		}
		System.out.println("********************");
		Set<String> tree = new TreeSet<String>();
		tree.add("Brad");
		tree.add("Sara");
		tree.add("Sara"); 	
		tree.add("Murthy");
		 
		
		 
		for(String name :tree){
			System.out.println(name);
		}
		    Queue<Integer> queue = new  LinkedBlockingQueue<Integer>(5);
			try {
				
				queue.add(1);
				queue.add(2);
				queue.add(3);
				queue.add(4);
				queue.add(5);
				
			} catch (IllegalStateException  e) {
				System.out.println("Queue is full");
			}
	 
			for(Integer name :queue){
				System.out.println(name);
			}
			System.out.println(queue.poll());
	 
			System.out.println(queue.element());
			System.out.println(queue.peek());
			
			 Map<Integer, String> map = new HashMap<Integer, String>();
			 map.put(3, "Priyanka");
			 map.put(2, "Rahul");
			 map.put(1, "Mia");
			 map.put(4, "Angle");
			 map.put(5, "Chaand");
			 
			 for(Map.Entry<Integer, String> entry: map.entrySet()){
				 System.out.println(entry.getKey() + " " + entry.getValue());
			 }
			 System.out.println( "*******************");
			 for(Integer key: map.keySet()){
				 System.out.println( map.get(key) + " "+ key );
			 }
			 
			 System.out.println( "*******************");
			 Iterator<Entry<Integer, String>>entry = map.entrySet().iterator();
			 while(entry.hasNext()){
				 Entry<Integer, String> e = entry.next();
				 System.out.println(e.getKey() + " " + e.getValue() );
			 }
			 System.out.println( "*******************");
			 
			 Map<Integer, String> treeMap = new TreeMap <Integer,String>();
			 treeMap.put(3, "Generics");
			 treeMap.put(1, "Files under Java");
			 treeMap.put(5, "NetWorking");
			 treeMap.put(2, "OOPS");
			 treeMap.put(5, "Expressions");
			 treeMap.put(4, "Methods");
			
			 for(Map.Entry<Integer, String> tm: treeMap.entrySet()){
				 System.out.println(tm.getKey() + " " + tm.getValue());
			 }
			 
			 System.out.println( "*******************");
			 Map<Code, String> treeMap1 = new TreeMap <Code,String>();
			 treeMap1.put(new Code("S01","L03"), "Generics");
			 treeMap1.put(new Code("S01","L01"), "Files under Java");
			 treeMap1.put(new Code("S02","L03"), "NetWorking");
			 treeMap1.put(new Code("S01","L07"), "OOPS");
			 treeMap1.put(new Code("S01","L05"), "Expressions");
			 treeMap1.put(new Code("S01","L03"), "Methods");
			  
			 for(Map.Entry<Code, String> tm: treeMap1.entrySet()){
				 System.out.println(tm.getKey() + " " + tm.getValue());
			 }
			 System.out.println( "*******************");
			// String name1= "Sara";
			// String name2= "Sara";
			// System.out.println(name1==name2 );
			 String name1= new String("Sara");
			 String name2= new String("Sara");
			 System.out.println(name1.equals(name2) );// true, because String class ovrrides equals and hashcode method
			 Code code1 = new Code("S01","L01");
			 Code code2 = new Code("S01","L01");
			 System.out.println(" code1 and code2 comaprision " + code1.equals(code2) );// hash codes are different that is why they are not equeal. Need to override the equal ana hashcode methods
			 System.out.println( "*******************");
		 
			List<String> list = new ArrayList<>();
			list.addAll(set);
			Collections.sort(list);
			for(String name: list){
				 System.out.println( name );
			}
			System.out.println(list.get(2));
		System.out.println(Collections.binarySearch(list, "Sara"));
	}

	 
         
}
class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;	
	 

	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	@Override
	public String toString() {
		return "code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}

	@Override
	public int compareTo(Code arg0) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = arg0.sectionNo.concat(arg0.lectureNo);
		return code1.compareTo(code2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lectureNo == null) ? 0 : lectureNo.hashCode());
		result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		if (lectureNo == null) {
			if (other.lectureNo != null)
				return false;
		} else if (!lectureNo.equals(other.lectureNo))
			return false;
		if (sectionNo == null) {
			if (other.sectionNo != null)
				return false;
		} else if (!sectionNo.equals(other.sectionNo))
			return false;
		return true;
	} 
	
	
	
}
