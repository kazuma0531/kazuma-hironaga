// メソッド 課題3
public class Task3 {
	public static String add(String name1, String name2) {    //文字列
		return name1  + name2;    //文字列と文字列の結合の処理
	}
	public static int add(int num3, int num4) {    //整数
		return num3 + num4;    //整数と整数を合計する処理
	}
	public static double add(double dec5, double dec6) {    //小数
		return dec5 + dec6;    //小数と小数を合計する処理
	}
	
    public static void main(String[] args) {
		System.out.println("--①文字列だけの場合---");
		String a = add("文字列1","文字列2");
		System.out.println(a);    //出力結果:文字列1文字列2
		
		System.out.println("---②整数だけの場合----");
		int b = add(3, 5);
		System.out.println(b);    //出力結果:8
		
		System.out.println("---③少数だけの場合----");
		double c = add(3.5, 5.5);
		System.out.println(c);    //出力結果:9.0
    }
}

/* 上記の想定結果
 * --①文字列だけの場合---
 * 文字列1文字列2
 * ---②整数だけの場合----
 * 8
 * ---③少数だけの場合----
 * 9.0
 */