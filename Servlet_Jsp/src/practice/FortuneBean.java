// 課題 3
package practice;

import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable{
	
	//privateなフィールド
	private Date today = new Date();
	private String fortune = "";

	//引数なしのコンストラクタ
	public FortuneBean() {};

	//todayフィールドのgetterメソッド
	public Date getToday() {
		return this.today;
	}
	//todayフィールドのsetterメソッド
	public void setToday(Date today) {
		this.today = today;
	}
	//fortuneフィールドのgetterメソッド
	public String getFortune() {
		return this.fortune;
	}
	//fortuneフィールドのsetterメソッド
	public void setFortune(String fortune) {
		this.fortune = fortune;
	}
}
