package practice13.common;

public class Item {
	private String name;
	private int additionalDamage;

	public Item(String string, int i) {
		this.name = string;
		this.additionalDamage = i;
		// TODO 自動生成されたコンストラクター・スタブ
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdditionalDamage() {
		return additionalDamage;
	}

	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}


}
