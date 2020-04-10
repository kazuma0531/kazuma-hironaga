//課題 4
package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("numA: ");
		int numA = scanner.nextInt();
	       
		    System.out.print("numB: ");
		int numB = scanner.nextInt();
	
		if(numA % numB == 0) {          //約数の場合
			System.out.println("numBはnumAの約数です");            //出力結果
		}else if(numA % numB != 0) {   //約数でない場合
			System.out.println("numBはnumAの約数ではありません");  //出力結果
		}
		}catch(ArithmeticException e){ //正の整数以外入力された場合
			System.out.println("正の数を入力してください"); 
			scanner.close();
		}
	}
}
/*上記の想定結果
 * numA: (入力した数字)
 * numB: (入力した数字)
 * (入力した数字の結果により3つの出力結果が出る。)
 */

///緑の数字を消す方法