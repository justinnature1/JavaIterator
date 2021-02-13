package javaIteratorPattern;

import java.util.LinkedList;

public class Inventory {
	LinkedList <Weapon> inventory;

	public Inventory () {
		inventory = new LinkedList<Weapon>();
	}

	public void add(Weapon weapon) {
		if (!inventory.contains(weapon))
			inventory.add(weapon);

	}

	public void remove(Weapon weapon) {
		if(inventory.contains(weapon))
			inventory.remove(inventory.indexOf(weapon));
	}
	public LinkedList<Weapon> getInventory () {
		return inventory;
	}

	public Iterator createIterator() {
		return new InventoryIterator(this.inventory);
	}
}
