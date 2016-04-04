package edu.asu.foa.algo.design.patterns;

public class UFOEnemyShip extends EnemyShip{

	EnemyShipFactory shipFactory;
	
	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}
	
	@Override
	void makeShip() {
		// TODO Auto-generated method stub
		System.out.println("Making enemy ship:" + getName());
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addEsEngine();
	}

		
}
