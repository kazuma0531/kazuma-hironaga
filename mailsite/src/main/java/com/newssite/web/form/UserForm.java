package com.newssite.web.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(min = 3, max = 16, message = "アカウント名は、3文字以上16文字以下で入力してください。")
	private String username;

	@NotNull
	@Size(min = 6, max = 32, message = "パスワードは、6文字以上32文字以下で入力してください。")
	private String password;
	
	
	@NotNull
	private String confilm;
	
	
	

	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfilm() {
		return this.confilm;
	}

	public void setConfilm(String confilm) {
		this.confilm= confilm;
	}

}