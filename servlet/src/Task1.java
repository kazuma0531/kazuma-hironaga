// サーブレット 課題1

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task1")	//URL
public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Task1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");	//出力形式と文字エンコーディングを設定
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title> ServletTask </title>");	//タイトル
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello World</h1>");			//h1タグで設定
		out.println("<p>初めてのサーブレット</p>");		//行間を空ける
		out.println("</body>");
		out.println("</html>");
	}
}

/* 上記の想定結果
 * Hello World(h1タグ)
 * 
 * 初めてのサーブレット(pタグ)
 */
