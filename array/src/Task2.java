//課題 2
public class Task2 {

	public static void main(String[] args) {
		int[] array = {7,6,5,4,3,2,1};
		 for(int i = 0; i < array.length; i++) {
			 if(array[i] > array[6]) {
				    System.out.print(array[i] + ",");    //array[0]～[5]まで出力
			 }else{
					System.out.println(array[6]);    //array[6]を出力
			 }
		 }
		 for(int i=array.length-1; i > 0; i--) {
			 if(array[i] > array[6]) {
				    System.out.print(array[i] + ",");    //配列arrayの内容を逆から出力
		     }else{
			        System.out.print(array[6] + ",");
		     }
		 }
		            System.out.println(array[0]);

	}

}
/* 上記の想定結果
 * 7,6,5,4,3,2,1
 * 1,2,3,4,5,6,7
 */
