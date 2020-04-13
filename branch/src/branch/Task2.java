//課題 2 
package branch;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("数字を入力してください");
		int num = scanner.nextInt();
		if(num < 10) {    //10未満の数を入力した場合
		    System.out.println("値: " + 0 + num);    //入力した数字の頭に0がつく結果が出力される。
		}
		if(num > 9) {     //10以上の数を入力した場合
		    System.out.println("値: " + num);        //入力した数字で結果が出力される。
		scanner.close();
		}
		
	}
}

/*上記の想定結果
 * 数字を入力してください
 * (数字を入力)
 * (値: 数字を出力(1桁の場合は入力した数字の頭に0がつく))
 */
