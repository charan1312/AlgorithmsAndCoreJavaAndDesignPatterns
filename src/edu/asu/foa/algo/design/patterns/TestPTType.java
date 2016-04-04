package edu.asu.foa.algo.design.patterns;

public class TestPTType {

	public static void main(String[] args) {
		
		CloneFactoryPTType animalMaker = new CloneFactoryPTType();
		
		SheepPTType sally = new SheepPTType();
		
		SheepPTType clonedSheep = (SheepPTType) animalMaker.getClone(sally);
		
		System.out.println(sally);
		
		System.out.println(clonedSheep);
		
		System.out.println(System.identityHashCode(sally));
		
		System.out.println(System.identityHashCode(clonedSheep));
		
		System.out.println();
		
		DogPTType vicky = new DogPTType();
		
		DogPTType clonedDog = (DogPTType) animalMaker.getClone(vicky);
		
		System.out.println(vicky + "----" + System.identityHashCode(vicky));
		
		System.out.println(clonedDog + "----" + System.identityHashCode(clonedDog));
		
	}
}
