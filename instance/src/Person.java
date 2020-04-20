// インスタンスとクラス 課題1
public class Person {
	//属性(フィールド)
	String name ="廣永 一馬";
	int age = 24;
	
	public  void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}
