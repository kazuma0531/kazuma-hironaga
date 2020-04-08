import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        System.out.print("数字を入力してください: " );
		    
		    int number = scanner.nextInt();
		    int index = 0;
		    int sum = 0;
		    
		    while(index <= number) {
		    	sum += index;		    		
		    	index++;
		    }
		    	 System.out.print("1～" + number +"までの合計: " + sum);
		    	 scanner.close();
		}
	
 }