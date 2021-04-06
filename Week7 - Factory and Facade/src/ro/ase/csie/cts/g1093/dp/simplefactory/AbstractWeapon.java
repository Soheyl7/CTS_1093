package ro.ase.csie.cts.g1093.dp.simplefactory;

public abstract class AbstractWeapon {

	
	protected String description;
	protected int powerLevel;
	
	
	
	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public abstract void pewPew();
}
