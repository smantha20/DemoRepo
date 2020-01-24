package org.studyeasy;

public class AppMultiThread { 

	public static void main(String[] args) throws InterruptedException {
		 MyCounter counter1 = new MyCounter(1);
		 MyCounter counter2 = new MyCounter(2);  
		 long startTime = System.currentTimeMillis();
		 counter1.start();
		 System.out.println("**************************");
		 counter2.start();
		 Thread.sleep(15000);
		 long endTime = System.currentTimeMillis();
		 System.out.println("process time" + (endTime - startTime));
	}

}

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}
	@Override
	public void run(){
	    countMe();	
	}
	
	public void countMe(){
		for(int i =0; i<= 10; i++){
			 
		    	try {
					sleep(1000);
				} catch (InterruptedException e) {					 
					e.printStackTrace();
				}
			    System.out.println("The value of i is :" + i+ " and the thread number is :"+ threadNo);
			    
		}
	}
}