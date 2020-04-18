// メソッド 課題4

public class Task4 {

	public static void main(String[] args) {
		String [] a = {"a","b","c"};
		String [] b = {"a",null,"c"};    //18行目のnullを判断する為、nullは""で囲まない
		
		System.out.println("---配列にnullがない場合---");
		System.out.println(nullcheck(a));
		System.out.println("---配列にnullがある場合---");
		System.out.println(nullcheck(b));
		
	}
	public static boolean nullcheck(String[] test1) {
		boolean result = false;    //戻り値 変数 = 文字列で10,12行目で判断する。
		for(int i = 0; i< test1.length; i++) {    //String [] aとString [] bがそれぞれtest1.lengthに代入して判断
			if(test1[i] == null) {    
				result = true;    //変数 = 文字列で10,12行目で判断する。
			}
	    }
		return result;
    }
}

/* 上記の想定結果
 * ---配列にnullがない場合---
 * false
 * ---配列にnullがある場合---
 * true
 */
