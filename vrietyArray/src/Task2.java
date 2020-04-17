// 色々な配列 課題2
import java.util.ArrayList;
public class Task2 {

	public static void main(String[] args) {
		int [] arr =  {21,3,32,6,99,72,78,51,1,26,87,11,48,60};
		ArrayList<Integer> ki = new ArrayList<>();    
		ArrayList<Integer> gu = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {    //arr[0]～arr[13]まで繰り返す
			if(arr[i] % 2 != 0) {    //割る2をした時、余りが出た場合に処理(奇数)
				ki.add(arr[i]);
			}else{
				gu.add(arr[i]);
			}
		}
		System.out.println("奇数: " + ki);    //奇数の処理
		System.out.println("偶数: " + gu);    //偶数の処理
	}
}

/* 上記の想定結果
 * 奇数: [21, 3, 99, 51, 1, 87, 11]
 * 偶数: [32, 6, 72, 78, 26, 48, 60] 
 */
