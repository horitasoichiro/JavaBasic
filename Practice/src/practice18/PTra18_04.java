/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ① ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください ★
		 * ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] pline = line.split(",", 0);
				Player player = new Player();

				player.setPosition(pline[0]);
				player.setName(pline[1]);
				player.setCountry(pline[2]);
				player.setTeam(pline[3]);

				array.add(player);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		ArrayList<Player> arrayGK = new ArrayList<Player>();
		ArrayList<Player> arrayDF = new ArrayList<Player>();
		ArrayList<Player> arrayMF = new ArrayList<Player>();
		ArrayList<Player> arrayFW = new ArrayList<Player>();

		int numGK = 0;
		int numDF = 0;
		int numMF = 0;
		int numFW = 0;

		Collections.shuffle(array);

		for (int i = 0; i < array.size(); i++) {

			String str = array.get(i).getPosition();

			if (str.equals("GK") && numGK < 1) {
				arrayGK.add(array.get(i));
				numGK++;
			}
			else if (str.equals("DF") && numDF < 4) {
				arrayDF.add(array.get(i));
				numDF++;
			}
			else if (str.equals("MF") && numMF < 4) {
				arrayMF.add(array.get(i));
				numMF++;
			}
			else if (str.equals("FW") && numFW < 2) {
				arrayFW.add(array.get(i));
				numFW++;
			}
		}

//		array.stream().filter((player) -> {return player.getPosition().equals("DF");})
//		.forEach((player) -> { System.out.println(player.toString()); });

		for (Player player : arrayGK) {
			System.out.println(player.toString());
		}
		for (Player player : arrayDF) {
			System.out.println(player.toString());
		}
		for (Player player : arrayMF) {
			System.out.println(player.toString());
		}
		for (Player player : arrayFW) {
			System.out.println(player.toString());
		}

	}
}
