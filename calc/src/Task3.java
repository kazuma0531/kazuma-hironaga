

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
		int d = (a + b + c);
		int e = ((a + b + c) / 3);
		double f = ((a + b + c) / 3.0);
		    
		    System.out.println();
		    System.out.println("合計: " + d);
		    System.out.println("平均(3で割った時): " + e);
		    System.out.println("平均(3.0で割った時): " + f);
		    scanner.close();

	}

}
