package edu.asu.foa.algo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import edu.asu.foa.algo.bean.Car;
import edu.asu.foa.algo.bean.Driver;

public class DriverAssignment {

	Car car;
	Driver driver;
	
	public DriverAssignment(Car car,Driver driver) {
		// TODO Auto-generated constructor stub
		this.car = car;
		this.driver = driver;
	}
	
	public static List<DriverAssignment> assignDriver(List<Car> carList, List<Driver> driverList) {
		
		if ( carList.isEmpty() || driverList.isEmpty() ) { 
			return null;
		}
		
		List<DriverAssignment> result = new ArrayList<DriverAssignment>();
		
		Iterator<Car> carIter = carList.iterator();
		Iterator<Driver> driverIter = driverList.iterator();
		
		while( carIter.hasNext() && driverIter.hasNext() ) {
			DriverAssignment da = new DriverAssignment(carIter.next(), driverIter.next());
			result.add(da);
		}
		
		return result;
	}
	
	public static void main(String [] args) {
	
		List<Car> carList = new ArrayList<Car>();
		Car c1 = new Car("1111","Audi");
		Car c2 = new Car("2222","BMW");
		Car c3 = new Car("3333","Merc");
		carList.add(c1);
		carList.add(c2); 	
		carList.add(c3);
		
		List<Driver> driverList = new ArrayList<Driver>();
		
		Driver d1 = new Driver("2 years", "Steve");
		Driver d2 = new Driver("2 years", "Tom");
		//driverList.add(d1);
		//driverList.add(d2);
		//driverList.add(d3);
		driverList.addAll(Arrays.asList(d1,d2));
		
		List<DriverAssignment> finalResult =  new ArrayList<DriverAssignment>();
		
		finalResult = assignDriver(carList,driverList);
		
		System.out.println("The Cars that are assigned to Drivers are:");
		for(DriverAssignment da : finalResult) {
			System.out.println(da.car.getCarId() + " assigned to " + da.driver.getDriverName());
		}
	}
}
	