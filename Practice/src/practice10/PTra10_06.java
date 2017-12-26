package practice10;

import java.util.Scanner;

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
		Scanner scanner = new Scanner(System.in);

		Car[] cars;
		cars = new Car[3];
		for (int i = 0; i < cars.length; i++) {
			System.out.println((i + 1) + "台目");
			cars[i] = new Car();
			System.out.println("車体の色、ガソリン量をカンマ区切りで入力してください。");
			String line = scanner.nextLine();
			String[] data = line.split(",");

			cars[i].color = data[0];
			cars[i].gasoline = Integer.parseInt(data[1]);
		}

		final int distance = 100;
		// int[] count = new int[cars.length];
		// for (int i = 0; i < cars.length; i++) {
		// int move = 0;
		// while (distance - move > 0) {
		// int ret = cars[i].run();
		// if (ret == -1) {
		// count[i] = -1;
		// break;
		// }
		// move += ret;
		// count[i]++;
		// }
		// }
		//
		// for(int i=0;i<cars.length;i++) {
		// if(count[i]==-1) {
		// System.out.println((i+1)+"台目は到達できませんでした");
		// }else {
		// System.out.println((i+1)+"台目の掛かった時間:"+count[i]+"時間");
		// System.out.println("残りのガソリンは、"+ cars[i].gasoline +"リットルです");
		// }
		//
		// }
		for (int i = 0; i < cars.length; i++) {
			int advance = 0;
			int advanceSum = 0;
			for (int n = 0; advanceSum < distance; n++) {
				advance = cars[i].run();
				advanceSum = advanceSum + advance;
				if (advanceSum > distance) {
					System.out.println(
							cars[i].color + "色の車は目的地にまで" + n + "時間かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです");
				}
				if (advance == -1) {
					System.out.println(cars[i].color + "色の車は目的地まで到着できませんでした。");
					break;
				}

			}
		}

	}
}
