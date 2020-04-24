// 標準クラス 課題7    
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Task7 {

	public static void main(String[] args) {
		//日付を文字列のフォーマットに処理
		SimpleDateFormat zikoku = new SimpleDateFormat("yyyy年MM月dd日");
			
		//現在日時を出力する処理
		Calendar now = Calendar.getInstance();
		System.out.println("現在日時: " + zikoku.format(now.getTime()));
		
		//addメソッドを使って1週間後の日時を出力
		now.add(Calendar.DAY_OF_MONTH,7);
		System.out.println("１週間後: " + zikoku.format(now.getTime()));
		
		//setメソッドを使って1年後の日時を出力
		Calendar nextYear = Calendar.getInstance();
		nextYear.set(Calendar.YEAR, 2021);
		//日付フォーマット E は曜日
		SimpleDateFormat rainen = new SimpleDateFormat("yyyy年MM月dd日(E)");
		System.out.print("１年後  : " + rainen.format(nextYear.getTime()) );
	}
}

/* 現在日時: ○○年○○月○○日    現在日時を出力
 * １週間後: ○○年○○月○○日    1週間後の日時を出力
 * １年後  : ○○年○○月○○日(曜日) 1年後の日時を出力
 */
