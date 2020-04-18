// メソッド 課題1
public class Task1 {

	public static void main(String[] args) {
		myProfile("コラボ");
		int a = 30;
		myProfile(a);
		double b =178.0;
		myProfile(b);
	}
	public static void myProfile(String name){
		System.out.println("私の名前は" + name + "です。");
	}
	public static void myProfile(int old){
		System.out.println("年齢は" + old + "歳です。");
	}
	public static void myProfile(double hei){
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
