package ro.ase.csie.cts.g1093.dp.factorymethod;

import ro.ase.csie.cts.g1093.dp.simplefactory.SuperHero;
import ro.ase.csie.cts.g1093.dp.simplefactory.WeaponType;
import ro.ase.csie.cts.g1093.dp.simplefactory.WeaponsFactory;

public class TestFactory {

	public static void main(String[] args) {
		
		
		boolean kidsMode = true;
		
		if(kidsMode) {
			SuperHero superman = new SuperHero("Superman",new WaterPistol());
		}
		else
		{
			SuperHero superman = new SuperHero("Superman", WeaponsFactory.getWeapon(WeaponType.PISTOL, "" ));
		}

	}

}
