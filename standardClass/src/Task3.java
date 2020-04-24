// 標準クラス 課題3
public class Task3 {

	public static void main(String[] args) {
		String str = "ABCDEFG";
		System.out.println("文字列: "+ str);
		
		//文字列"ABCDEFG"をループ文で文字列の逆から処理
		for(int i = str.length()-1; i >= 0; i--) {
			//指定位置の文字を取得
			System.out.print(str.charAt(i));
		}
		System.out.println( ": 列字文" );
	}
}

/* 上記の想定結果
 * 文字列: ABCDEFG
 * GFEDCBA: 列字文
 */
