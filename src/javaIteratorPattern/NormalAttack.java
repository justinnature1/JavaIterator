package javaIteratorPattern;

public class NormalAttack extends Attack {

	protected int getDamage(Actor attacker) {
		int damage = 0;
		if (Math.random()<=attacker.getCriticalHitPercent()) {
			damage = attacker.getDamage()*2;
			System.out.print("Critical Hit! ");
		}
		else {
			damage = attacker.getDamage();
		}
		return damage;
	}

}
