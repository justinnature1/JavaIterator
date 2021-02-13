package javaIteratorPattern;

public abstract class Actor {
	protected String name;
	protected int maxHitPoints;
	protected int hitPoints;
	protected int defense;
	protected Attack normalAttack = new NormalAttack();
	protected Weapon weapon = new NoWeapon();
	protected AttackCommand attackCommand;

	protected long lastAttack = 0; //Stores the time in milliseconds since the last successful attack
	
	public String getName() {
		return name;
	}

	public AttackCommand getAttackCommand() {
		return this.attackCommand;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMaxHitPoints() {
		return maxHitPoints;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void setMaxHitPoints(int maxHitPoints) {
		this.maxHitPoints = maxHitPoints;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		if (hitPoints <= 0) this.hitPoints = 0;
		else this.hitPoints = hitPoints;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public long getLastAttack() {
		return lastAttack;
	}

	public void setLastAttack(long lastAttack) {
		this.lastAttack = lastAttack;
	}

	public void attack(Actor attacked) {
		this.attackCommand.setAttacked(attacked);
		attackCommand.execute();
	}

	public String displayHealth() {
		return (this.getHitPoints() + "/" + this.getMaxHitPoints());
	}

	public boolean blockAttack(Actor attacker) {
		boolean blocked;
			blocked = Math.random() < .25 * this.getDefense() /(this.getDefense()+ attacker.getDefense());
		if (blocked) System.out.println(this.getName() + ": Blocked Attack!");
		return blocked;
	}
	
	public int getDamage() {
		return getWeapon().getDamage();
	}

	public double getCriticalHitPercent() {
		return getWeapon().getCriticalHitPercent();
	}

	public int getAttackSpeed() {
		return getWeapon().getAttackSpeed();
	};
	
	public boolean isDead() {
		return getHitPoints() <= 0;
	}
	
	
	
}
