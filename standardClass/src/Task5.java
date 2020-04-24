// 標準クラス 課題5
public class Task5 {

	public static void main(String[] args) {
		String cartoon = "cat_mouse_mouse_cat_cat";
		//文字列を配列化する処理
		String[] quarrel = cartoon.split("_");
		
		int tom = 0;
		int jelly = 0;
		//拡張for文
		for(String text1 : quarrel) {
			//text1がcatと文字が同じだった場合の処理
			if(text1.equals("cat")) {
				tom++;
				//text1がcatと違う文字だった場合の処理(mouseの処理)
			}else {
				jelly++;
			}
		}
		if(tom > jelly) {
			System.out.println("catの方が多い");
		}else {
			System.out.println("mouseの方が多い");
		}
	}
}

/* 上記の想定結果
 * catの方が多い
 */
