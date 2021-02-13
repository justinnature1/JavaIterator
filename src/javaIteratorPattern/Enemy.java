package javaIteratorPattern;

public class Enemy extends Actor {
	
	public Enemy(Weapon weapon, String name) {
		this.hitPoints = this.maxHitPoints = 400;
		this.defense = 20;
		this.name = name;
		this.weapon = weapon;
		this.attackCommand = new AttackCommand(normalAttack,this,null);
	}
	
}
