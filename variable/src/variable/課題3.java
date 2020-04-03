//課題3 （型変換の実行）
package variable;

public class 課題3 {

	public static void main(String[] args) {

	int intNum = 219;
	long a = intNum;     //int を long に変換

	double doubleNum = 364.2;
	float b = (float) doubleNum;    //double を float に強制変換

    long longNum = 123456L;
    double c = longNum;     //long を double に変換

    System.out.println(a);    //219
    System.out.println(b);    //364.2
    System.out.println(c);    //123456.0

	}
}
