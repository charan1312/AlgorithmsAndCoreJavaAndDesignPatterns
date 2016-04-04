package edu.asu.foa.algo.design.patterns;

public class UFOEnemyShipFactory implements EnemyShipFactory{

	@Override
	public ESWeapon addESGun() {
		// TODO Auto-generated method stub
		return new ESUFOGun();
	}

	@Override
	public EsEngine addEsEngine() {
		// TODO Auto-generated method stub
		return new ESUFOEngine();
	}

	
}
