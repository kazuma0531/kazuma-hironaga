//課題3
package calc;

import java.util.Scanner;

public class 課題3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 3; i++) {
		System.out.print(i + 1 + "個目の数 = ");
		sum += scanner.nextInt();
		}
		System.out.println("合計 = " + sum);
		System.out.println("平均(3で割った時) = " + (int)sum / (int)3.0);
		System.out.println("平均(3.0で割った時)= " + (double)sum /3.0);

		scanner.close();
	}

}
