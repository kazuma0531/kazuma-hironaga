// データ操作（GETとPOST）課題 3

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		//requestが入力されたもの
		//responseが出力するよう
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title> 訪問回数 </title>");	//タイトル
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>訪問回数テスト (クッキー)</h1>");	//h1タグで設定

		//Cookieの値を取得
		Cookie cookies[] = request.getCookies();

		//Cookie変数の宣言
		Cookie visitedCookie = null;

		//nullチェック
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("visit")) {
					visitedCookie = cookies[i];

				}
			}
		}
		if(visitedCookie != null) {
			//IntegerクラスのparseIntメソッドを呼んで()の中をString型からint型に変換している。
			int visit = Integer.parseInt(visitedCookie.getValue()) + 1;

			out.println("<p>" + visit + "回目の訪問です。</p>");
			visitedCookie.setValue(Integer.toString(visit));
			visitedCookie.setMaxAge(300);
			response.addCookie(visitedCookie); 
		}else {
			out.println("<p>初めての訪問です。</p>");
			Cookie newCookie = new Cookie("visit", "1");
			newCookie.setMaxAge(300);
			response.addCookie(newCookie);
		}
		out.println("<a href =/dataOperation/CountCookie>画面を再訪問</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
