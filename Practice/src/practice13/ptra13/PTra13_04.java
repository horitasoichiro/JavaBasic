/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero hero = new Hero();
		Slime slime = new Slime();
		hero.setName("勇者");
		slime.setName("スライム");
		String win = null;
		String loose = null;

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * ●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定 上記を繰り返し行います
		 */

		while (true) {
			if (slime.damage(hero.attack()) == true) {

				win = (hero.getName());
				loose = (slime.getName());
				break;
			}
			if (hero.damage(slime.attack()) == true) {

				win = (slime.getName());
				loose = (hero.getName());
				break;
			} else {
				continue;
			}

			// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

		}
		System.out.println(win + "は" + loose + "との戦闘に勝利した");
	}
}
