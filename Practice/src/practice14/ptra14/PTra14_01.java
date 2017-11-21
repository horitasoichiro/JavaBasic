/*
 * PTra14_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

import practice14.common.Course;

public class PTra14_01 {

	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称 「【Eラーニング】Java」 単元 式と演算 制御構文 メソッド 配列 オブジェクト指向 継承 高度な継承
	 */
	public class JavaCouse implements Course {

		String courseName = "Java";
		String[] courseUnit = { "式と演算", "制御構文", "メソッド", "配列", "オブジェクト指向", "継承", "高度な継承", };

		@Override
		public String getCourseName() {

			return courseName;
		}

		@Override
		public String[] getCourseUnit() {

			return courseUnit;

		}

	}

}
