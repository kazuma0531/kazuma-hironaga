import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("数字を入力してください: " );
		
		int i = scanner.nextInt();
		System.out.println(i);
		int sum = 0;
		while(i > 5 ) {    //右の文字がなぜかそのまま出力される
			sum += i;
			i--;
			
		}
		System.out.println(i);
	}
 }

//Scannerでのwhile文での計算が反映されず