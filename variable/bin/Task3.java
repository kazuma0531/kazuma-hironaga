
public class taskk3 {

	public static void main(String[] args) {
		int intNum = 219;
		double doubleNum = 364.2;
		long longNum = 123456L;
		
		System.out.println("変換前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);
		
	    long a = intNum;     //int を long に変換
	    float b = (float) doubleNum;    //double を float に強制変換
	    double c = longNum;     //long を double に変換
	    
	    System.out.println("変換後");
	    System.out.println(a);    //219
	    System.out.println(b);    //364.2
	    System.out.println(c);    //123456.0


	}

}
