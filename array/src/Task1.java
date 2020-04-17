//配列 課題 1
public class Task1 {

	public static void main(String[] args) {
    int[] array = {4,9,19,5,8,21,42,64,73,18,2};
		System.out.print("配列: [");
		for(int i = 0; i < array.length; i++) {    //iはインデックス(0～10)を共有
			if(i ==array.length -1) {    //lengthは配列変数の個数
				System.out.print(array[i]);
			}else{
				System.out.print(array[i] + ",");    //配列[0]～[10]まで出力
			}	
		}
		System.out.println( "]");    //配列[11]を出力
		int sum = 0;
		for(int ary : array) {    
		    sum += ary;    //配列の中にある整数を+で合計
		}
		System.out.println("合計: " + sum);
	}
}

/* 上記の想定結果
 * 配列: [4,9,19,5,8,21,42,64,73,18,2]
 * 合計: 265
 */
