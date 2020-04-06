//課題 1
package branch;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		    System.out.println("10以上の数字を入力してください ");
        int num = scanner.nextInt();
        if(num < 10) {    //10未満の数を入力した場合
            System.out.println("値: " + num * 10 );    //入力した数字*10で結果が出力される。
        }
        if(num > 9) {     //10以上の数を入力した場合
            System.out.println("値: " + num);          //入力した数字で結果が出力される。
        scanner.close();
        }
	}
}

/*上記の想定結果
 * 10以上の数字を入力してください
 * (数字を入力)
 * 値: (入力した数字が出力(10未満の場合は*10で結果が出力))
 */
