
public class Weapon {
	
// ****** Data Member ******	
	
	private String name;
	private int range;
	private double damageFactor;
	private boolean isMelee;
	
	
// ****** Constructor ******
	public Weapon(String name, int range, double damageFactor, boolean isMelee) {
		super();
		this.name = name;
		this.range = range;
		this.damageFactor = damageFactor;
		this.isMelee = isMelee;
	}


// ***** Getters and Setters *******
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public double getDamageFactor() {
		return damageFactor;
	}


	public void setDamageFactor(double damageFactor) {
		this.damageFactor = damageFactor;
	}


	public boolean isMelee() {
		return isMelee;
	}


	public void setMelee(boolean isMelee) {
		this.isMelee = isMelee;
	}


	@Override
	public String toString() {
		return "Weapon [name=" + name + ", range=" + range + ", damageFactor=" + damageFactor + ", isMelee=" + isMelee
				+ "]";
	}
	


}
