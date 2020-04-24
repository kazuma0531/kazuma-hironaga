// 標準クラス 課題1
public class Task1 {

	public static void main(String[] args) {
		//先頭と末尾に空白がある文字列を変数に代入
		String extra = " tech-compass ";
		//先頭と末尾の空白を削除する処理
		String fix = extra.trim();
		
		//空白を削除する前の変数( extra )を出力した場合
		System.out.println("変換前: " + extra);
		//空白を削除した処理の文字列を大文字に変換
		System.out.println("変換後: " +fix.toUpperCase());
	}
}

/* 上記の想定結果
 * 変換前:  tech-compass 
 * 変換後: TECH-COMPASS
 */
