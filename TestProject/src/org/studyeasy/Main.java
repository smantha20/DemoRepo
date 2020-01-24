package org.studyeasy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		 
		File directory = new File("c:\\sara\\studyeasy");
		directory.mkdirs();
		File file = new File("c:\\sara\\studyeasy\\test.txt");
		file.createNewFile();
		
		try 
		   (BufferedWriter bw = new  BufferedWriter(new FileWriter(file))){  // try with resources
		   bw.write("Chaand");	
		   bw.newLine();
		   bw.write("Shabaz");
		   bw.newLine();
		   bw.write("Salim");
		   bw.newLine();
		   bw.write("Praful");
		   bw.newLine();
		   bw.write("Aarti");
		   bw.newLine();
		   bw.write("Priyanka");
		   bw.newLine();
		   
		   System.out.println("Wrting onto the file completed");
		   
		}catch(IOException  ex){
			System.out.println("error occured, while creating writing onto file");
		}
		BufferedReader br = null;
		try{   
			 br = new BufferedReader( new FileReader("c:\\sara\\studyeasy\\test.txt"));
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}finally{
			if(br != null){
			   br.close();
			}   
		}
		System.out.println("**********************");
		Scanner sc = new Scanner(new File("c:\\sara\\studyeasy\\test.txt"));
	 
		while (sc.hasNext()){
			System.out.println(sc.nextLine());
		}
        sc.close();
	}		
	
}
