// 標準クラス 課題2
public class Task2 {

	public static void main(String[] args) {
		//抽出元"Java Programming Training"を変数に代入
		String source = "Java Programming Training";
		
		//変数に代入した文字列( source )"Java Programming Training"を抽出
		String subSource1 = source.substring(17);
		String subSource2 = source.substring(0,16);
		
		//0から数えて17から最後までの文字列を出力
		System.out.println(subSource1);
		//0から数えて0から16未満(15まで)までの文字列を出力
		System.out.println(subSource2);
	}
}
/* 上記の想定結果
 * Training
 * Java Programming
 */
