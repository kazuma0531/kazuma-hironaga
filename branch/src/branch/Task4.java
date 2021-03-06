//課題 4
package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("numA: ");
		int numA = scanner.nextInt();
		   
		System.out.print("numB: ");
		int numB = scanner.nextInt();
		
		if(numA <= 0 || numB <= 0) {
			System.out.println("正の数を入力してください");
		}else if(numA % numB == 0) {		  //約数の場合
			System.out.println("numBはnumAの約数です");			//出力結果
		}else{ 
			System.out.println("numBはnumAの約数ではありません");  //出力結果
		}
		scanner.close();
	}
}
/*上記の想定結果
 * numA: (入力した数字)
 * numB: (入力した数字)
 * (入力した数字の結果により3つの出力結果が出る。)
 */

/*numAとnumBが両方とも正の数の場合に、約数の判定をする、とした方がif文の分岐が少なくなります。
*とありますが、従来0の計算だとエラーを起こすため、このようなコードになっているのですが、
* 先に正の数を判断した場合このような出力になってしまいます。
*/
