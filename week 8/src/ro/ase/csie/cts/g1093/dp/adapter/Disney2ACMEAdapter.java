package ro.ase.csie.cts.g1093.dp.adapter;

public class Disney2ACMEAdapter extends ACMECharacter {

	
	DisneyActions disneyCharacter = null;
	
	public Disney2ACMEAdapter(DisneyActions disneyC) {
		super(disneyC.getName(),disneyC.getPowerLevel());
		this.disneyCharacter=disneyC;
		
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.disneyCharacter.changeLocation(0, 0);
	}

	@Override
	public void takeAHit(int points) {
		// TODO Auto-generated method stub
		this.disneyCharacter.losePower(points);
	}

	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub
		this.disneyCharacter.recoverPower(points);
	}

	
	
	
}