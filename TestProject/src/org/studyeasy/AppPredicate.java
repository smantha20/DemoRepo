package org.studyeasy;

import java.util.function.IntPredicate;

public class AppPredicate {

	public static void main(String[] args) {
	 IntPredicate lessthan21 = new IntPredicate(){
		 @Override
			public boolean test(int value) {
			    if(value == 21){
			    	return false;
			    }else{
				  return true;
			    }  
			}
	 };
	 System.out.println(lessthan21.test(20));
	 IntPredicate lessThan50 = i->i<50;
	 System.out.println(lessThan50.test(40));
	 lessthan21 = i->i<21;
	 IntPredicate moreThan10 = i->i>10;
	 System.out.println(lessthan21.and(moreThan10).test(210));
	 
	 
  }
}	