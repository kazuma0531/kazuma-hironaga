//  オブジェクト指向 課題4
public class dog extends Animal{
	double weight;
	
	//コンストラクタを生成
	public dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public void run() {
		System.out.println(this.name + "は走った");
	}
	public void sleep() {
		System.out.print(this.name + "は");
		super.sleep();
	}
}
