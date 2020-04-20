// 課題3
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("数字を入力してください: " );
		int n = scanner.nextInt();
		int a = 0;
		while(n > 0){    //入力した回数が0になるまで処理
			a ++;    //ブロック内の処理が終了した後、変数aを+1で実行される
            n = n / 10;    //入力した整数を10で割る。
		}
		System.out.print("桁数: "  + a);
		scanner.close();
	}
}
/* 上記の想定結果
 * 数字を入力してください: (数字を入力)
 * 桁数: (10で割った回数分の数が出力)
*/