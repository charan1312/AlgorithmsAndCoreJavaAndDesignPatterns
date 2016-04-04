package edu.asu.foa.algo.design.patterns;

public class DogPTType implements AnimalPTType{

	public DogPTType() {
		// TODO Auto-generated constructor stub
		
		System.out.println("DOg Is made- Cons");
	}
	@Override
	public AnimalPTType makeCopy() {
		// TODO Auto-generated method stub
		System.out.println("Dog clone is being made- make copy");
		DogPTType dogclone = null;
		try {
			dogclone = (DogPTType) super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return dogclone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dog class - To String";
	}
}
