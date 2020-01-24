package org.studyeasy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
	 
		try {
			FileInputStream inputstream = new FileInputStream("c:\\sara\\studyeasy\\vehicles.dat");
			try {
				ObjectInputStream obs = new ObjectInputStream(inputstream);
				try {
					Vehicle1 v1 = (Vehicle1) obs.readObject();
					Vehicle1 v2 = (Vehicle1) obs.readObject();
					
					System.out.println("Object 1: "+v1);
					System.out.println("Object 1: "+v2);
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	}

}
