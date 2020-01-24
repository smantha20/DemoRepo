package org.studyeasy;

import java.io.Serializable;

/**
 * @author mlman
 *
 */
public class Vehicle1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7491630194135665206L;
	private String type;
	private int number;

	public Vehicle1(String type, int number) {
		this.type = type;
		this.number = number;
	}
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}
}
