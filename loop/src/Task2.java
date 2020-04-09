import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("数字を入力してください: " );
		
		int number = scanner.nextInt();
	    int sum = 0;
	    for(int i = 1; i <= number; i++) {	
	    	if(number > i) {    //1～入力した数字を含まない数字まで
	            System.out.print(i + " + ");
	        }else{    //入力した数字の処理
	        	
	            System.out.print(i);	
	    	}
	    	sum = i + sum;
	    }
	    System.out.print(" = " + sum);
	    	
		scanner.close();
	}

}
/*上記の想定結果
 * 数字を入力してください: (数字を入力)
 * (入力した数字までの足し算と合計)
 */
