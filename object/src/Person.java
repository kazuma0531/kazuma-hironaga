// オブジェクト指向 課題1 課題2 課題3
public class Person {
	//静的フィールド
	public static int wallet = 0;
	//名前と年齢の変数宣言
	private String name;
	private int age;
	
	//名前・年齢の引数なしとありのコンストラクタ
	public Person(){};
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//名前のメソッド
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//年齢のメソッド
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//静的フィールドのコンストラクタ
	Person(int price){
		this.wallet = this.wallet + price;
	}
	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}
