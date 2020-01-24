package org.studyeasy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeTofile {

	public static void main(String[] args) {
		 /*try{    
           FileOutputStream fout=new FileOutputStream("c:\\sara\\testout.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);  
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){
            	System.out.println(e);
            }
		   FileInputStream inputStream;
		try {
			inputStream = new FileInputStream("c:\\sara\\testout.txt");
			 try {
					inputStream.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}     
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
      } */  
	  
			    FileInputStream instream = null;
			 	FileOutputStream outstream = null;
			  
			     	try{
			     	   // File infile =new File("C:\\sara\\testOut.txt");
			     	   // File outfile =new File("C:\\sara\\MyOutputFile.txt");
			  
			     	    instream = new FileInputStream(new File("C:\\sara\\testOut.txt"));
			     	    outstream = new FileOutputStream(new File("C:\\sara\\MyOutputFile.txt"));
			     	   
			     	    byte[] buffer = new byte[1024];
			  
			     	    int length;
			     	    /*copying the contents from input stream to
			     	     * output stream using read and write methods
			     	     */
			     	    while ((length = instream.read(buffer)) > 0){
			     	    	outstream.write(buffer, 0, length);
			     	    }

			     	    //Closing the input/output file streams
			     	    instream.close();
			     	    outstream.close();

			     	    System.out.println("File copied successfully!!");
			  
			     	}catch(IOException ioe){
			     		ioe.printStackTrace();
			     	 }
		  

	} 

}
