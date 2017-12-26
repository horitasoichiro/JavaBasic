package practice14.common;

public class javaCouese implements Course{

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
