package edu.asu.foa.algo.design.patterns;

public class FactoryProducer {
	
	 public static AbstractFactory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShpFctry();
	         
	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFctry();
	      }
	      
	      return null;
	   }

}
