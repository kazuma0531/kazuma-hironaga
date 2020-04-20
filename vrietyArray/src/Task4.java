//色々な配列 課題4
import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {

	public static void main(String[] args) {
		HashMap<String,ArrayList<Integer>> label = new HashMap<>() ;
		ArrayList<Integer> gu = new ArrayList<>();    
		ArrayList<Integer> ki = new ArrayList<>();
		label.put("偶数: ", gu);    //ArrayList gu をmapで管理
		label.put("奇数: ", ki);    //ArrayList ki をmapで管理
		int [] arr =  {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {    //偶数を判断
				gu.add(arr[i]);
			}else{    //偶数と判定されなかった(奇数)数を判断
				ki.add(arr[i]);
			}
		}
		System.out.println(label);
	}
}

/* 上記の想定結果
 * {偶数: =[32, 6, 72, 78, 26, 48, 60, 46, 74, 14], 奇数: =[21, 3, 99, 51, 1, 87, 11, 29, 5, 193, 215, 83]} 
 */
