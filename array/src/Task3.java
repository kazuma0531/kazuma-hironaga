// 課題 3
import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		System.out.print("[");
		Random rnd = new Random();
		int[] n = new int[6];
		n[0] = rnd.nextInt(10);    //1～9の整数 1つめの整数
		n[1] = rnd.nextInt(10);    //1～9の整数 2つめの整数
		n[2] = rnd.nextInt(10);    //1～9の整数 3つめの整数
		n[3] = rnd.nextInt(10);    //1～9の整数 4つめの整数
		n[4] = rnd.nextInt(10);    //1～9の整数 5つめの整数
		n[5] = rnd.nextInt(10);    //1～9の整数 6つめの整数
		
		int max = n[0];
		int min = n[0];
		for(int i =0; i <= 5; i++) {
			if(i <= 4) {    //配列[0]から[4]までの整数
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


