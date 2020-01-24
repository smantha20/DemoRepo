package org.studyeasy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		Vehicle1 bike = new Vehicle1("bike", 9444);
		Vehicle1 car = new Vehicle1("Car", 4268);
		//Student student = new Student("John","Frost",22);
		try(
			FileOutputStream fos = new FileOutputStream("c:\\sara\\studyeasy\\vehicles.dat")){		     
			
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(bike );
				 
				obj.writeObject(car );
				System.out.println("Object written onto the file");
			}

		} catch (FileNotFoundException e) {
			System.out.println("ileNotFoundException");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}


	}

}
