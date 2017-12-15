/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player>array=new ArrayList<Player>();

		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] pline = line.split(",",0);
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


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		for(int i =array.size()-1; i>0;i--) {
			String str = array.get(i).getTeam();
			if(str.equals("レアル・マドリード")||str.equals("バルセロナ")) {

				array.remove(i);
			}
		}


		// ★ 削除後のArrayListの中身を全件出力してください
		for(Player player :array) {
			System.out.println(player.toString());
		}


	}
}
