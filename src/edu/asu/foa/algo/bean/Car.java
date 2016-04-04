package edu.asu.foa.algo.bean;

public class Car {

	private String carId;
	private String carName;
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public Car(String cid,String cname) {
		this.carId = cid;
		this.carName = cname;
	}
	
}
