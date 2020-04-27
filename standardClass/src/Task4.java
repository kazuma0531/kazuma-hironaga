// 標準クラス 課題4
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		String search = "ABCDGOPQRSYZ";
		System.out.print("探したい文字: " );
		//データを入力する為、Scannerをインストール
		Scanner scanner = new Scanner(System.in);
		//入力した文字を変数( input )に代入
		String input = scanner.next();
		int result = search.indexOf(input);
		
		/*
		 * 文字を入力した際、以下の2つの条件で処理
		 * ①文字を1つ入力した際に、"ABCDGOPQRSYZ"があった場合
		 * ②文字を2つ以上入力して、かつ入力した文字が"ABCDGOPQRSYZ"連続で入力された場合(CDG)
		 */
		if(result < 0) {
			System.out.println(search + "は" + input + "を含まない");
		}else {
			System.out.println(search + "は" + input + "を含む");
		}
		scanner.close();
	}
}

/* 上記の想定結果
 * 探したい文字: (文字を入力)
 * ※ABCDGOPQRSYZが入力した文字にあった場合
 * ABCDGOPQRSYZは(入力した文字)を含む
 * 
 * ※ABCDGOPQRSYZが入力した文字にない場合
 * ABCDGOPQRSYZは(入力した文字)を含まない
 */
