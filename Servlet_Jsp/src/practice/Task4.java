// 課題 4
package practice;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/task4")	//fortune_resultのURLを設定

public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Task4() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//パスを定数として宣言
		final String PATH = "/WEB-INF/jsp/fortune_result.jsp";	
		response.setContentType("text/html; charset=UTF-8");
		
		Date today = new Date();
		String [] fortunes = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		Random rand = new Random();
		String fortune = fortunes[rand.nextInt(6)];

		FortuneBean fortunebean = new FortuneBean();
		fortunebean.setToday(today);
		fortunebean.setFortune(fortune);
		//リクエストスコープにデータを格納する処理
		request.setAttribute("uranau",fortunebean);
		
		request.getRequestDispatcher(PATH).forward(request, response);
	}
}
