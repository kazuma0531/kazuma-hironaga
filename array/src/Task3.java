//配列 課題 3
import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		System.out.print("[");
		Random rnd = new Random();
		int[] n = new int[6];
		for(int i = 0; i < n.length; i++) {
			n[i] = rnd.nextInt(10);
		}
		
		int max = n[0];
		int min = n[0];
		for(int i =0; i < n.length; i++) {
			if(i < n.length -1) {    //配列[0]から[4]までの整数
				System.out.print(n[i] + ",");
		    }else{    //[5]の整数
			    System.out.println(n[i] + "]");
		    }
			
			if(max < n[i]) {	
				max = n[i];
			}
			if(min > n[i]) {	
				min = n[i];
			}
		}
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);
	}
}
/* 上記の結果
 * [Randomクラスで出力された整数1～9の6つ]
 * 最大値: (ランダムで出力された整数の中で一番大きい数字)
 * 最小値: (ランダムで出力された整数の中で一番小さい数字)
 */


