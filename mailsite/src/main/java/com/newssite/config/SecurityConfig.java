package com.newssite.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	UserDetailsManager userDetailsManager;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// UserDetailServiceとPasswordEncorderを指定
		auth.userDetailsService(userDetailsManager).passwordEncoder(passwordEncoder);
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// Configure a new SecurityChainFilter.
		//ログインしなくても画面遷移の処理を行う　permitAll()は誰でも許可
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/login*").permitAll()		//ログイン画面
		.antMatchers("/logout").permitAll()		//ログアウト
		.antMatchers("/signup").permitAll()		//新規登録
		.antMatchers("/register").permitAll()	//新規登録確認画面のaction値
		.antMatchers("/check").permitAll()		//新規登録画面
		.antMatchers("/finish").permitAll()
		.antMatchers("/finished").permitAll()	//新規登録完了画面
		.antMatchers("/article").permitAll()	
		.antMatchers("/article/*").permitAll()	
		.anyRequest().authenticated();
		//ログインした人のみ画面遷移を許可
		http.formLogin()
		.loginPage("/login")		//ログイン
		.loginPage("/LoginSecurity") //ログインとセキュリティ画面
		.loginPage("/delete")		//削除確認画面
		.loginPage("/remove")		//削除確認画面のaction値
		.loginPage("/Delete complete")	//	削除確認画面
		.usernameParameter("username")		
		.passwordParameter("password")
		.successForwardUrl("/")
		.failureForwardUrl("/login-fail?error")
		.loginPage("/account1")
		.permitAll();
		http.logout()
		.logoutSuccessUrl("/")
		.permitAll();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// Configure a new SecurityChainFilter
		web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
	}
}
