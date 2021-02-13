package javaIteratorPattern;

public class TestInventoryIterator {

	public static void main(String[] args) {

		//Create instances for concrete weapon factory classes.
		WeaponCreator daggerCreator = new DaggerCreator();
		WeaponCreator swordCreator = new SwordCreator();
		WeaponCreator axeCreator = new AxeCreator();

		Player player = new Player(axeCreator.createWeapon(WeaponCreator.RARE));
		
		player.getInventory().add(swordCreator.createWeapon(WeaponCreator.NORMAL));
		player.getInventory().add(axeCreator.createWeapon(WeaponCreator.UNIQUE));
		player.getInventory().add(daggerCreator.createWeapon(WeaponCreator.MAGIC));
		player.getInventory().add(swordCreator.createWeapon(WeaponCreator.RARE));
		
		player.printInventory();
		
	}

}
