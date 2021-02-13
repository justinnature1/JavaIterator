package javaIteratorPattern;

public class AttackCommand implements Command {
	private Attack attack;
	private Actor attacker;
	private Actor attacked;

	public void setAttack(Attack attack) {
		this.attack = attack;
	}

	public void setAttacked(Actor attacked) {
		this.attacked = attacked;
	}

	public AttackCommand(Attack attack, Actor attacker, Actor attacked) {
		this.attack = attack;
		this.attacker = attacker;
		this.attacked = attacked;
	}

	public void execute() {
		attack.attack(attacker, attacked);
	}
	
}
