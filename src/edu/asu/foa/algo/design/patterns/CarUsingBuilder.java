package edu.asu.foa.algo.design.patterns;

public class CarUsingBuilder {

	int year;
	String make;
	String model;
	String carType;
	
	public static class CarBuilder {
		int year;
		String make;
		String model;
		String carType;
	
		public CarBuilder year(int year) {
			this.year = year;
			return this;
		}
		
		public CarBuilder make(String make) {
			this.make = make;
			return this;
		}
		
		public CarBuilder model(String model) {
			this.model = model;
			return this;
		}
		
		public CarBuilder carType(String carType) {
			this.carType = carType;
			return this;
		}
		
		public CarUsingBuilder build() {
			return new CarUsingBuilder(this);
		}
	}
	
	public CarUsingBuilder(CarBuilder carBuilder) {
		this.year = carBuilder.year;
		this.make = carBuilder.make;
		this.model = carBuilder.model;
		this.carType = carBuilder.carType;
	}

	@Override
	public String toString() {
		return "CarUsingBuilder [year=" + year + ", make=" + make + ", model="
				+ model + ", carType=" + carType + "]";
	}
	
	
	
	
	public static void main(String[] args) {
		
		CarUsingBuilder car = new CarUsingBuilder.CarBuilder().year(2016)
															  .make("Dodge")
															  .build();
		
		System.out.println(car);
		
	}	
}
