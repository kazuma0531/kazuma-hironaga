

public class Task2 {

	public static void main(String[] args) {
		int a = 10, b = 12, c = 13;
		int d = (a + b + c);
		int e = ((a + b + c) / 3);
		double f = 3.0;
		double g =  11.666666666666666;

		System.out.println("合計: " + d); //合計: 35

		System.out.println("平均(3で割ったとき): " + e); //平均(3で割ったとき): 11

		System.out.println("平均(3.0で割ったとき): " + (d / f));    //平均(3.0で割ったとき):11.66666

	}

}
