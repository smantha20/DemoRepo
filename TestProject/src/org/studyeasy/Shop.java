package org.studyeasy;

import java.util.Scanner;

import org.studyeasy.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		if(door.getLock().isUnlocked(args[0])){
			System.out.println("Welcome, we are open");
		}else{
			System.out.println("We are closed now, please visit later");
		}
		 System.out.println("What is you name");
		 Scanner sc = new Scanner(System.in);
		// String name = sc.next();
		// System.out.println("Name is " +name);
		 int age = sc.nextInt();
		 System.out.println("age is " +age);
		 sc.close();

	}
	 
}
