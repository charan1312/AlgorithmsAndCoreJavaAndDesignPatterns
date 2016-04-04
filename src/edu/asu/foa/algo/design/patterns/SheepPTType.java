package edu.asu.foa.algo.design.patterns;

public class SheepPTType implements AnimalPTType{

	public SheepPTType() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Sheep is made-Cons");
	}
	
	
	@Override
	public AnimalPTType makeCopy() {
		// TODO Auto-generated method stub
		System.out.println("Sheep is being made- Make Copy");
		
		SheepPTType sheepObject = null;
		
		try {
			sheepObject = (SheepPTType) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return sheepObject;
	}
	
	public String toString() {
		
		return "Sheep object to string- To String";
	}

}
