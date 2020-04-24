// 標準クラス 課題6
import java.text.SimpleDateFormat;
import java.util.Date;
public class Task6 {

	public static void main(String[] args) {
		//日付を扱う為、dateクラスをインストール
		Date now = new Date();
		//取得した日付をフォーマットにして表示
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
		
		//現在の時刻を出力
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
	}
}

/* 上記の想定結果
 * ○○○○年○○月○○日(現在の時刻を表示)
 * ○○○○年○○月○○日○○時○○分(現在の時刻を表示)
*/
