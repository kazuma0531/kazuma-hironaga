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
	        System.out.println("numA: " + c);        //入力した数字が出力
	        
	    int max = maxValue(a, b, c);
	        System.out.println("最大値: " + max);    //出力結果に入力した数字の中で最大値の数字が表示される
	        scanner.close();
	        }
	       
	    public static int maxValue(int a, int b, int c) {
	        int max = a;            //numAが最大値の場合に(最大値: a)で出力される
	        if (max < b) max = b;    //numBが最大値の場合に(最大値: b)で出力される
	    	if (max < c) max = c;    //numCが最大値の場合に(最大値: c)で出力される
			return max;
    }
}

/*上記の想定結果
 * numA: (入力された数字)
 * numB: (入力された数字)
 * numC: (入力された数字)
 * 最大値: (3つの中の最大値が出力)
 */
