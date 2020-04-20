// 課題1
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("数字を入力してください: " );
	
		int number = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i <= number; i++) {	
			sum = i + sum;
		}
		System.out.print("1～" + number + "までの合計: " + sum);
		scanner.close();
	}
}

/*上記の想定結果
 * 数字を入力してください: (数字を入力)
 * 1～(入力した数字)までの合計: （入力した数字から～0までの合計が出力）
 */

