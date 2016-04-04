package edu.asu.foa.algo.bean;

public class Driver {

	private String driverExp;
	private String driverName;
	
	public String getDriverExp() {
		return driverExp;
	}
	public void setDriverExp(String driverExp) {
		this.driverExp = driverExp;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Driver(String dexp,String dname) {
		this.driverName = dname;
		this.driverExp = dexp;
	}
}
