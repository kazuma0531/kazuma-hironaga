//課題 5
package branch;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
			
		int a = scanner.nextInt();
			    System.out.println("numA: " + a);        //入力した数字が出力
			
		int b = scanner.nextInt();
		        System.out.println("numB: " + b);        //入力した数字が出力
		    
		int c = scanner.nextInt();
		        System.out.println("numC: " + c);        //入力した数字が出力
		        
		    
		        
		if(a > b && a > c) {
		    System.out.println("最大値 : " + a);
		}else if(b > c && b > a)  {
		    System.out.println("最大値 : " + b);
		}else if(c > a && c > b) {
		    System.out.println("最大値 : " + c);
		scanner.close();
		    }
		
	}
}



/*上記の想定結果
 * numA: (入力された数字)
 * numB: (入力された数字)
 * numC: (入力された数字)
 * 最大値: (3つの中の最大値が出力)
 */
