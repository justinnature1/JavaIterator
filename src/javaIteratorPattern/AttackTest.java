package javaIteratorPattern;


public class AttackTest {
	public static void main (String[] args) {

		//Create instances for concrete weapon factory classes.
		WeaponCreator daggerCreator = new DaggerCreator();
		WeaponCreator swordCreator = new SwordCreator();
		WeaponCreator AxeCreator = new AxeCreator();

		Enemy[] enemies = {new Enemy(daggerCreator.createWeapon(),"Bob"),
				new Enemy(swordCreator.createWeapon(WeaponCreator.MAGIC),"Sir Bob")};

		Player player = new Player(AxeCreator.createWeapon(WeaponCreator.RARE));
		for (int i = 0; i < enemies.length; i++) {
			
			if (i%2 == 0) ((Player) 
					player).leftMouseClicked();
			else 
				player.rightMouseClicked();
			System.out.println(player.getName() + " with Equipped Weapon: " + player.getWeapon().getDescription());
			System.out.println(player.getWeapon().weaponStats());	
			System.out.println("vs.");
			System.out.println(enemies[i].getName() + " with Equipped Weapon: " + enemies[i].getWeapon().getDescription());
			System.out.println(enemies[i].getWeapon().weaponStats());	
			
			while (!player.isDead() && !enemies[i].isDead()) {
				player.attack(enemies[i]);
				enemies[i].attack(player);
			}
			
			System.out.println(enemies[i].getName() + "'s Health: " + enemies[i].getHitPoints() + "/" + enemies[i].getMaxHitPoints());
			
			System.out.println();
		}

	}
}
