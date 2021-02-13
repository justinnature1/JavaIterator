package javaIteratorPattern;

public class SpecialAttack extends Attack {

	protected int getDamage(Actor attacker) {
		System.out.print("Special Attack! ");
		return attacker.getDamage() * (int) (Math.random()*2 + 1.5);
	}

}
