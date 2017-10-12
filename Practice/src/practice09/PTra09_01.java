package practice09;

import practice09.util.Util;

public class PTra09_01 {
	public static void main(String[] args) {
		String str = "この文字列をゆっくり表示したい";

		// ★ 変数strを、Util内のメソッドを用いて0.5秒間隔で表示させなさい
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
//		long sec = 30;
		String modStr = Util.dispMessageSlowly(str,30);
		System.out.println(modStr);

	}
}
