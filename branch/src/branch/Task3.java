//課題 3
package branch;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num > 0 ) {        //正の数を入力した場合
            System.out.print("入力された数字は正の数です。");    //出力結果
		}else if(num < 0) {  //負の数を入力した場合
        	System.out.print("入力された数字は負の数です。");    //出力結果
		}else if(num == 0) { //0の数を入力した場合
			System.out.print("入力された数字は0の数です。");     //出力結果	
		}
		scanner.close();
	}
}

/*上記の想定結果
 * (数字の入力)
 * (入力した数字の結果により3つの出力結果が出る。)
 */
