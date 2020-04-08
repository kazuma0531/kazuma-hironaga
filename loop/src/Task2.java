import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("数字を入力してください: " );
		
		int number = scanner.nextInt();
	    int sum = 0;
	    for(int i = 1; i <= number; i++) {	
	    	if(number > i) {
	            System.out.print(i + " + ");
	        }else{
	            System.out.print(i);	
	    	}
	    	sum = i + sum;
	    }
	    System.out.print(" = " + sum);
	    	
	    	
		scanner.close();
	}

}

