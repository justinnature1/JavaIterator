package javaIteratorPattern;



public abstract class Weapon {
	protected int damage = 0;
	protected int attackSpeed = 0;
	protected double criticalHitPercent = 0;

	
	protected String description = "Unnamed Weapon";
	
	
	public double getCriticalHitPercent(){
		return criticalHitPercent;
	}
	
	public int getAttackSpeed() {
		return attackSpeed;
	}
	
	public int getDamage() {
		return damage;
	}
	
	//Displays the weapons statistics
	public String weaponStats() {
		return "\tDamage: " + getDamage() + 
				"\n\tAttackSpeed: " + getAttackSpeed() +
				"\n\tCritical Hit: " + String.format("%.1f", getCriticalHitPercent() * 100) + "%";
	}
	
	public String getDescription() {
		return description;
	}
	

}
