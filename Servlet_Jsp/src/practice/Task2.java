// 課題 2
package practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/task2")	//hello.jspのURLを設定
public class Task2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Task2() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//パスを定数として宣言
		final String PATH = "/WEB-INF/jsp/hello.jsp";
		//Task2サーブレットからhello.jspを呼び出す処理
		request.getRequestDispatcher(PATH).forward(request, response);
	}
}
