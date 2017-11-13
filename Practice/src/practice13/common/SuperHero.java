package practice13.common;

public class SuperHero extends Hero {

	private Item equipment;

	public Item getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Item equ) {
		this.equipment = equ;
	}

	public int attack() {
		return super.attack() + equipment.getAdditionalDamage();

	}
}