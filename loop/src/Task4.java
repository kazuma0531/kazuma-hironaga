//課題 4
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("正の整数を入力してください: " );

		int number = scanner.nextInt();
		int sum = 0;
	    System.out.print(number + "の約数: ");
	    for(int i = 1; i < number; i++) {	
	    	if(number % i == 0) {
	    		System.out.print(i + ",");
	    	}
	    	sum = i + sum;
	    }
	    System.out.print(number);
	    scanner.close();
	}
}

