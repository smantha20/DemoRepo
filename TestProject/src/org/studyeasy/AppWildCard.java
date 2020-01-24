package org.studyeasy;

import java.util.ArrayList;
import java.util.List;


class Vehicle{
	private Integer vehicleId;

	public Vehicle(Integer vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}

	public Integer getVehicleId() {
		return vehicleId;
	}
	void info(){
		System.out.println("vehicle ID is "+getVehicleId());
	}
}	
	
class Car extends Vehicle{
   private String model;
   
   public Car(Integer vehicleId,String model) {
		super(vehicleId); 
		this.model = model;
	}
	@Override
   public String toString() {
	return "Car [model=" + model + "]";
   }
	public String getModel() {
	  return model; 
	}
}
public class AppWildCard {
 
   public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14, "A14"));
		display(list);
   
	}
	public static void display(List<? extends Vehicle > list){
		for(Vehicle element: list){ 
			element.info();
		}
	}
}
