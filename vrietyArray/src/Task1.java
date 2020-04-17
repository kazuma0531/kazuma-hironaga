// 色々な配列 課題 1
import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> japan = new ArrayList<>();
		japan.add("北海道");
		japan.add("東北");
		japan.add("関東");
		japan.add("中部");
		japan.add("近畿");
		japan.add("中国");
		japan.add("九州");
		
		for(String tihou : japan) {
			System.out.println(tihou);
		}
	}
}

/*上記の想定結果
 * 北海道
 * 東北
 * 関東
 * 中部
 * 近畿
 * 中国
 * 九州
*/