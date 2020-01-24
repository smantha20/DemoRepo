package org.studyeasy;



class DataGeneric<K extends Number, V extends AppGen >{
private K key;
private V value;

public DataGeneric(K key, V value) {
 
	this.key = key;
	this.value = value;
}

@Override
public String toString() {
	return "Data [key=" + key + ", value=" + value + "]";
}

public K getKey() {
	return key;
}

public V getValue() {
	return value;
}

public< E extends Character, N extends Number> void display(E element, N number){
	System.out.println("Element :" + element + "  Numeber : "+ number);
}

}


public class AppGen {

	public static void main(String[] args) {
		DataGeneric<Number, AppGen> data = new DataGeneric<Number, AppGen>(1, new AppGen());
	    data.display('$', 5);
	    data.getValue().test();
	   
	    System.out.println( data.getKey());
	}
	
	public void test(){
		System.out.println("Testing ....");
	}

}
