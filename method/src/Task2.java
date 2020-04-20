
// メソッド 課題2
public class Task2 {
	public static void main(String[] args) {
		System.out.println("三角形の面積");
		System.out.println(getTriangleArea(30.0,9.0));    //a = 30.0 b = 9.0
	}
	public static double getTriangleArea(double base, double height){     //a = 30.0 b = 9.0
		 return Math.round (base * height / 2);    //三角形の面積の合計
	}
}

/* 上記の想定結果
 * 三角形の面積
 * 135.0
 */
