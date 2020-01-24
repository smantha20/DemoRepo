package org.studyeasy.demo;

public class Outer {
	 
	public static void testOuterMethod(){
		
		System.out.println("test " + Inner.x);
		Inner.testingInnerMethod();
	}
	public static class Inner {
        public static int x = 0;
		public static void testingInnerMethod() {
		   System.out.println("Testing inner class method.");
			 
			 
		}
	}

}
