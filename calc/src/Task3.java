import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		    
		int a = scanner.nextInt();
		    System.out.println(a);
		int b = scanner.nextInt();
		    System.out.println(b);
		int c = scanner.nextInt();
		    System.out.println(c);
		    System.out.println();
		    System.out.println("合計: " + (a + b +c));
		    System.out.println("平均(3で割った時): " + (a + b +c) / 3);
		    System.out.println("平均(3.0で割った時): " + (a + b +c) / 3.0);
		    scanner.close();
	}
}
