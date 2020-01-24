package org.studyeasy;

public class AppSynchronization {

	public static void main(String[] args) {
	  // Brakets brakets = new Brakets();
		new Thread (new Runnable(){

			@Override
			public void run() {
				for(int i=1; i<=5; i++){
					//brakets.generate();
					Brakets.generate("threadCode1");
				}
				
			}
			
		}).start();
		new Thread (new Runnable(){

			@Override
			public void run() {
				for(int i=1; i<=5; i++){
					//brakets.generate();
					Brakets.generate("threadCode2");
				}
				
			}
			
		}).start();
	}

}
class Brakets{
	

	synchronized static public void generate(String threadCode){
		for(int i=1; i<=10; i++){
			if(i<=5){
				System.out.print("[");
			}else{
				System.out.print("]");
			}
		}
		System.out.println("Generated by thread: "+threadCode);
	}
	
}

/*class Brakets{
	synchronized  public void generate(){
		for(int i=1; i<=10; i++){
			if(i<=5){
				System.out.print("[");
			}else{
				System.out.print("]");
			}
		}
		System.out.println();
	}
	
}
class Brakets{
	private Object lock = "lock";
	 public void generate(){		 
		synchronized (lock) {
		for(int i=1; i<=10; i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i<=5){
				System.out.print("[");
			}else{
				System.out.print("]");
			}
		}
		System.out.println();
		}
		
		for(int j=0; j<=10;j++){
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}*/
