// メソッド 課題1
public class Task1 {

	public static void main(String[] args) {
		String a ="コラボ";
		int b = 30;
		double c =178.0;
		
		myProfile(a,b,c);
	}
	public static void myProfile(String name, int old, double hei ){
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + old + "歳です。");
		System.out.println("身長は" + hei + "cmです。");
		System.out.println("よろしくお願いします。");
	}
}

/* 上記の想定結果
 * 私の名前はコラボです。
 * 年齢は30歳です。
 * 身長は178.0cmです。
 * よろしくお願いします。
 */
