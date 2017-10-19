package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 *
		 */
		Car[] car;
		car = new car[3]


		Car car1 = new Car();
		car1.color = "赤";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "青";
		car2.gasoline = 30;

		Car car3 = new Car();
		car3.color = "黄";
		car3.gasoline = 10;

		final int distance = 100;

		int advance = 0;
		int advanceSum = 0;

		for (int i = 0; advanceSum < distance; i++) {
			advance = car1.run();
			advanceSum = advanceSum + advance;
			if (advanceSum > distance) {
				System.out.println(car1.color + "色の車は目的地まで" + i + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです");
			}
			if (advance == -1) {
				System.out.println(car1.color + "色の車は目的地まで到着できませんでした");
				break;
			}

		}
		advance = 0;
		advanceSum = 0;
		for (int i = 0; advanceSum < distance; i++) {
			advance = car2.run();
			advanceSum = advanceSum + advance;
			if (advanceSum > distance) {
				System.out.println(car2.color + "色の車は目的地まで" + i + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
			}
			if (advance == -1) {
				System.out.println(car2.color + "色の車は目的地まで到着できませんでした");
				break;
			}

		}
		advance = 0;
		advanceSum = 0;
		for (int i = 0; advanceSum < distance; i++) {
			advance = car3.run();
			advanceSum = advanceSum + advance;
			if (advanceSum > distance) {
				System.out.println(car3.color + "色の車は目的地まで" + i + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです");
			}
			if (advance == -1) {
				System.out.println(car3.color + "色の車は目的地まで到着できませんでした");
				break;
			}
		}

	}
}
