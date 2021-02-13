package javaIteratorPattern;

import java.util.LinkedList;

public class InventoryIterator implements Iterator {
	LinkedList <Weapon> inventory;
	int currentPosition = 0;

	public InventoryIterator(LinkedList<Weapon> inventory) {
		this.inventory = inventory;
	}

	public Weapon next() {
		Weapon weapon = inventory.get(currentPosition);
		currentPosition ++;
		return weapon;
	}

	public boolean hasNext() {
		if (inventory.size()>currentPosition)
			return true;
		else
			return false;
	}

}
