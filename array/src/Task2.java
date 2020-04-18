//配列 課題 2
public class Task2 {

	public static void main(String[] args) {
		
		int[] h = new int[7];
		 
		for(int i = 0; i < h.length; i++) {
			 h[i] = 7 -i;
		}
		 
		for(int j = 0; j < h.length; j++) {
			if(j == h.length -1) {
				System.out.println(h[j]);	
			}else{
				System.out.print(h[j] + ",");
			}
		}
		for(int k = h.length; k > 0 ;k--) {
			if(k == 1) {
				System.out.print(h[k-1]);
			}else{
			    System.out.print(h[k-1] + ",");
			}
		}
	}
}
/* 上記の想定結果
 * 7,6,5,4,3,2,1
 * 1,2,3,4,5,6,7
 */
