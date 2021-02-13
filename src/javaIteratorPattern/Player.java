package javaIteratorPattern;

public class Player extends Actor {
	Inventory inventory = new Inventory();
	
	protected Attack specialAttack = new SpecialAttack();
	
	public Player(Weapon weapon) {
		this.hitPoints = this.maxHitPoints = 1000;
		this.defense = 50;
		this.name = "Player";
		this.weapon = weapon;
		this.attackCommand = new AttackCommand(normalAttack,this,null);
	}
	
	public Inventory getInventory () {
		return this.inventory;
	}
	
	public void printInventory () {
		Iterator inventoryIterator = inventory.createIterator();
		System.out.println(this.name + "'s Inventory:");
		while (inventoryIterator.hasNext()) {
			Weapon weapon =(Weapon) inventoryIterator.next();
			System.out.println(weapon.getDescription());
			System.out.println(weapon.weaponStats());
		}
	}
	
	//Better implemented in another class that handles keyboard and/or mouse commands
	//These two methods on my eclipse are not brought up by my player instance in the test class.
	//These methods would be a good invoker for the player's attack command too.
	public void rightMouseClicked(){
		this.attackCommand.setAttack(specialAttack);	
	}
	
	public void leftMouseClicked(){
		this.attackCommand.setAttack(normalAttack);		
	}
	
	
	
}
