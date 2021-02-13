package javaIteratorPattern;

import java.util.Date;

public abstract class Attack {
	abstract int getDamage(Actor attacker);
	
	public int attack(Actor attacker, Actor attacked) {
		int damage = 0;
		if (this.canAttack(attacker) && !attacked.blockAttack(attacker)) {
			damage = getDamage(attacker);
			attacked.setHitPoints(attacked.getHitPoints()-damage);
			System.out.println(attacked.getName()+ ": -" + damage + " " + attacked.displayHealth());
		}
		return damage;
	}
	
	//Determines if the weapon is ready to attack again based on attackSpeed
	protected boolean canAttack(Actor attacker) {
		Date date = new Date();
		long currentTime = date.getTime();
		//Produces the number of seconds since the last attack.
		double timeBetweenAttacks = (currentTime - attacker.lastAttack)/1000;
		//An attack speed of 100 represents 1 attack per second.  This formula below
		//is used to calculate the how many seconds must go by before another attack.
		double rechargeTime = 1000/(attacker.getAttackSpeed()*10);	
		//An attack is possible if there is sufficient time between attacks.
		if (timeBetweenAttacks >= rechargeTime) {
			attacker.setLastAttack(currentTime); //If an attack is possible, the lastAttack is reset.
			return true;
		}
		return false;
	}

}
