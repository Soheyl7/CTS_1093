package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.ACMECharacter;

public class ACMEAbstractDecorator extends ACMECharacter {

	public ACMEAbstractDecorator(ACMECharacter hero) {
		super(hero.getName(), hero.getLifePoints());
		this.character=hero;
		
		
		// TODO Auto-generated constructor stub
	}

	ACMECharacter character = null;
	
	
	@Override
	public int getLifePoints() {
		// TODO Auto-generated method stub
		return this.character.getLifePoints();
	}

	

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.character.move();
	}

	@Override
	public void takeAHit(int points) {
		// TODO Auto-generated method stub
		this.character.takeAHit(points);
	}

	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub
		this.character.heal(points);
	}
	
	
	
}