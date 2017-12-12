package practice16;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 */
public class PTra16_01 {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {

        /*
        * ★ java.util.Dateクラスを使って、自分の生年月日を「YYYY年MM月DD日」形式で出力してください
        *  ※　他の標準クラスも使って良いです
        */
    	Date date = new Date(85,10,06);
    	SimpleDateFormat f= new SimpleDateFormat("yyy年MM月dd日");
    	String dateStr = f.format(date);

    	System.out.println(dateStr);
    }
}