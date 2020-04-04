//課題2
package calc;

public class 課題2 {

	public static void main(String[] args) {
		int a = 10, b = 12, c = 13, d = 35, e = 3;
		double f = 3.0;

		a += b + c;
		System.out.println("合計: " + a); //合計: 35

		a /= e;
		System.out.println("平均(3で割ったとき): " + a); //平均(3で割ったとき): 11

		System.out.println("平均(3.0で割ったとき): " + (d / f));    //平均(3.0で割ったとき):11.66666

	}
}
