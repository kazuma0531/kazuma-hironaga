// 色々な配列 課題3
import java.util.HashMap;

public class Task3 {

	public static void main(String[] args) {
		HashMap<String,Integer> fruits = new HashMap<>();
		fruits.put("りんご", 130);
		fruits.put("みかん", 120);
		fruits.put("バナナ", 98);
		fruits.put("メロン", 6000);
		
		for(HashMap.Entry<String,Integer> en : fruits.entrySet()) {
			System.out.print(en.getKey());
			System.out.print(":");
			System.out.print(en.getValue());
			System.out.println("円");
		}

	}
}

/* 上記の想定結果
 * りんご:130円
 * メロン:6000円
 * みかん:120円
 * バナナ:98円
 */
