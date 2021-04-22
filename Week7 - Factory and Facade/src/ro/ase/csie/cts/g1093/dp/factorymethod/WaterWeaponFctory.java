package ro.ase.csie.cts.g1093.dp.factorymethod;

import ro.ase.csie.cts.g1093.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1093.dp.simplefactory.WeaponType;

public class WaterWeaponFctory extends AbstractFactory {

	
	
	public AbstractWeapon getWeapon(WeaponType type, String description) {
		
		AbstractWeapon weapon = null;
		switch(type) {
		case PISTOL:
			weapon = new WaterPistol();
			break;
		case MACHINE_GUN:
			weapon = new WaterBaloon();
			break;
		case BAZOOKA:
			weapon = new 
		}
	}
}
