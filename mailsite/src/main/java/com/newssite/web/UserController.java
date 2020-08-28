
package com.newssite.web;

import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.Errors;

import com.newssite.web.form.UserForm;

@Controller

public class UserController {

	@Autowired
	UserDetailsManager userDetailsManager;

	@Autowired
	PasswordEncoder passwordEncoder;

	private DataSource dataSource;


	@RequestMapping("/login*")
	private ModelAndView login(
			@ModelAttribute("username") String username,
			@ModelAttribute("password") String password,
			ModelAndView mav
			) {
		mav.setViewName("login") ;

		return mav;
	}

	@RequestMapping("/signup")
	private ModelAndView signup(
			@ModelAttribute UserForm form,
			ModelAndView mav
			) {
		mav.setViewName("signup");

		return mav;
	}


	@RequestMapping("/finished")
	private ModelAndView finished(
			@ModelAttribute UserForm form,
			ModelAndView mav
			) {
		mav.setViewName("finished");

		return mav;
	}

	@RequestMapping("/account")
	private String account(
			@ModelAttribute UserForm form,
			ModelAndView mav
			) {
		mav.setViewName("account1");

		return "account1";
	}

	@RequestMapping("/Mail")
	private String Mail(
			@ModelAttribute UserForm form,
			ModelAndView mav
			) {
		mav.setViewName("MaliChange");

		return "MaliChange";
	}

	@RequestMapping("/LoginSecurity")
	private String LoginSecurity(
			@ModelAttribute UserForm form,
			ModelAndView mav
			) {
		mav.setViewName("LoguinSecurity");

		return "LoginSecurity";
	}

	@RequestMapping("/delete")
	private String delete(
			@ModelAttribute UserForm form,
			ModelAndView mav
			) {
		mav.setViewName("delete");

		return "delete";
	}



	@RequestMapping(path = "/check", method = RequestMethod.POST)
	private String check(
			@Validated UserForm form,
			BindingResult result,
			Model model
			) {
		//名前とパスワードに不備がある場合、エラーをsignupに戻す。
		if (result.hasErrors()) {
			return "signup";
		}
		//同じユーザー名が重複しないようにする処理
		if (userDetailsManager.userExists(form.getUsername())) {
			result.rejectValue("username", "user.exists");
			return "signup";
		}
		//同じパスワードを入力しているかの確認の処理
		if (!form.getConfilm().equals(form.getPassword())) {
			result.rejectValue("password", "password.exists");
			return "signup";
		}

		return "check";
	}


	@RequestMapping(path = "/register", method = RequestMethod.POST)
	private String register(
			@Validated UserForm form,
			BindingResult result,
			Model model
			) {
		UserDetails user = new User(
				form.getUsername(),

				passwordEncoder.encode(form.getPassword()),
				AuthorityUtils.createAuthorityList("ROLE_USER")
				);
		userDetailsManager.createUser(user);

		return "finished";
	}

	//@AutowiredのJdbcTemplateを宣言し、データを削除する処理
	@Autowired
	private JdbcTemplate jdbc;

	@RequestMapping(path = "/remove", method = RequestMethod.POST)
	private String delete(
			@Validated UserForm form,
			BindingResult result,
			Model model
			) {
		//DELETE文を記述し、現在ログインしているデータを削除する
		final String sql = "DELETE FROM users WHERE username = ? ";

		jdbc.update(sql, new Object[]{form.getUsername()});
		return "Delete complete";

	}

}	







