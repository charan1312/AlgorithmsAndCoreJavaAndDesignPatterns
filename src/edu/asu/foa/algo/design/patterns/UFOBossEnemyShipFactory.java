package edu.asu.foa.algo.design.patterns;

public class UFOBossEnemyShipFactory implements EnemyShipFactory{

	@Override
	public ESWeapon addESGun() {
		// TODO Auto-generated method stub
		return new ESUFOBossGun();
	}

	@Override
	public EsEngine addEsEngine() {
		// TODO Auto-generated method stub
		return new ESUFOBossEngine();
	}

}
