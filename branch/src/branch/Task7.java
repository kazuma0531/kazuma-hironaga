//課題 7
package branch;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("病院に行く曜日を入力してください");
		System.out.println("【 日曜,月曜,火曜,水曜,木曜,金曜,土曜】");
		String day =  scanner.next();
		
		switch(day) {
			case "月曜":
			case "火曜":
			case "水曜":
			case "木曜":
			case "金曜":	
			System.out.println("午前治療と午後治療があります");	//月曜から金曜の入力の場合
			break;
			
			case "土曜":
			System.out.println("午前治療があります");			  //土曜の入力場合の場合
			break;
			
			case "日曜":
			System.out.println("日曜は休診です");				  //日曜の入力の場合
			break;
			
			default:
			System.out.println("入力を確認してください");		  //指定された文字列以外の入力の場合
			break;
			
		}
		scanner.close();
	}
}

/*上記の想定結果
 * 病院に行く曜日を入力してください
 * 【 日曜,月曜,火曜,水曜,木曜,金曜,土曜】
 * (↑の項目を入力)
 * (出力結果)
*/
