// オブジェクト指向 課題2 課題5
public class Main {

	public static void main(String[] args) {
		
		//dogクラスのインスタンスを生成
		dog inu = new dog("ポチ", 5, 12.3);
		//Animalクラスのインスタンスを生成
		Animal wan = new Animal();
		
		System.out.println("インスタンスを生成していない状態");
		System.out.println(Person.wallet);
		
		//インスタンスを2つ生成
		Person hoge01 = new Person(1000);
		Person hoge02 = new Person(2000);
		
		System.out.println("インスタンスhoge01でwalletにアクセス");
		System.out.println(hoge01.wallet);
		System.out.println("インスタンスhoge02でwalletにアクセス");
		System.out.println(hoge02.wallet);
		System.out.println("クラスPersonでwalletにアクセス");
		System.out.println(Person.wallet);
		
		System.out.println("名前 : " + inu.name);
		System.out.println("年齢 : " + inu.age);
		System.out.println("体重 : " + inu.weight + "kg");
		inu.run();
		wan.sleep();
		inu.sleep();
	}

}
