package edu.asu.foa.algo.design.patterns;

public class CloneFactoryPTType {

	public AnimalPTType getClone(AnimalPTType animalSample) {
		
		return animalSample.makeCopy();
	}
}
