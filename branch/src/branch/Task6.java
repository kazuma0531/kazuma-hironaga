//課題 6
package branch;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1から5までの数字を入力してください");
		int a = scanner.nextInt();
		
		switch(a) {		  //0と負の整数を入力した場合
			case 1:
				System.out.print(a + " -> Ⅰ");
				break;
			case 2:
				System.out.print(a + " -> Ⅱ");
				break;
			case 3:
				System.out.print(a + " -> Ⅲ");
				break;
			case 4:
				System.out.print(a + " -> Ⅳ");
				break;
			case 5:
				System.out.print(a + " -> Ⅴ");
				break;				 
		}  
		System.out.println(a + " -> unknown");
		scanner.close();
	}
	
}
/*上記の想定結果
 * 1から5までの数字を入力してください
 * (数字を入力)
 * (入力した数字 + 入力した数字によって出力結果がでる)
 */
