// 課題 1 
package practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/task1")	//URLを設定
public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Task1() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//HTML形式を出力
		response.setContentType("text/html; charset = UTF-8");	//出力形式と文字エンコーディングを設定
		//PrintWriterオブジェクトを変数に取得する処理
		PrintWriter out = response.getWriter();
		//レスポンスをPrintWriterクラスの変数(out).printlnで出力する処理
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>ServletJsp</title>");	//タイトルタグ
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>HelloServlet</h1>");		//h1タグで設定
		out.println("</body>");
		out.println("</html>");
	}
}
/* 上記の処理結果
 * (タイトルタグ) ServletJsp
 * (URL)http://localhost:8080/Servlet_Jsp/task1
 * (h1タグ)HelloServlet
 */
