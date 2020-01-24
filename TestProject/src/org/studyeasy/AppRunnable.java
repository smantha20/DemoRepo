package org.studyeasy;

import java.util.Random;

public class AppRunnable {

	public static void main(String[] args) {
		 /*Thread thread1 = new Thread(new MyCounter1(1));
		 Thread thread2 = new Thread(new MyCounter1(2));
		 thread1.start();
		 thread2.start();*/
		new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i =0; i<= 10; i++){
					   try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					   System.out.println("The value of i is :" + i);
				}
				
			}
			
		}).start();

	}

} class MyCounter1 implements Runnable{
	private int threadNo;

	public MyCounter1(int threadNo) {
		super();
		this.threadNo = threadNo;
	}
	@Override
	public void run(){
		Random random = new Random();
		for(int i =0; i<= 10; i++){
			   try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   System.out.println("The value of i is :" + i+ " and the thread number is :"+ threadNo);
		}
	}
 
}

