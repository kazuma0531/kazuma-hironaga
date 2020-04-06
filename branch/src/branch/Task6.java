//課題 6
package branch;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		    System.out.println("1から5までの数字を入力してください");
		int a = scanner.nextInt();
		
	    if(a < 1) {           //0と負の整数を入力した場合
    	    System.out.print(a + " -> unknown");           //出力結果
	    }else if(a < 2) {    //1の整数を入力した場合
			System.out.print(a + " -> Ⅰ");                //出力結果
	    }else if(a < 3) {    //2の整数を入力した場合
		    System.out.print(a +" -> Ⅱ");                 //出力結果
	    }else if(a < 4) {    //3の整数を入力した場合
	        System.out.print(a +" -> Ⅲ");                 //出力結果
	    }else if(a < 5) {    //4の整数を入力した場合
	        System.out.print(a +" -> Ⅳ");                 //出力結果
	    }else if(a < 6) {    //5の整数を入力した場合
	        System.out.print(a +" -> Ⅴ");                 //出力結果
	    }else {              //6以上の整数を入力した場合
		    System.out.print(a + " -> unknown");           //出力結果
		scanner.close();
	    }
    }
}
/*上記の想定結果
 * 1から5までの数字を入力してください
 * (数字を入力)
 * (入力した数字 + 入力した数字によって出力結果がでる)
 */
