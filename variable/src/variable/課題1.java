//課題1 (適切な型の変数に代入)
package variable;

public class 課題1 {

	public static void main(String[] args) {
    double a = 31.2;
    String b = "Java研修";
    int c = 9;
    float d = 2147483648F;
    long e = (long) d;
    char f = '才';

    System.out.println("・" + a);    //・31.2
    System.out.print("\n");
    System.out.println("・" + b);    //・Java研修
    System.out.print("\n");
    System.out.println("・" + c);     //・9
    System.out.print("\n");
    System.out.println("・" + e);    //・2147483648
    System.out.print("\n");
    System.out.println("・" + f);    //・才

	}
}
