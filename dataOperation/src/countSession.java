// データ操作（GETとPOST）課題 4

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/countSession")
public class countSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public countSession() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		//getSessionメソッドの引数falseはnullを返す。
		HttpSession session = request.getSession(false);

		out.println("<html>");
		out.println("<head>");
		out.println("<title>訪問回数</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>訪問回数テスト (セッション)</h1>");

		//String型greetingMsgをif文else文の引数で処理
		String greetingMsg;

		if (session == null){
			greetingMsg = "初めての訪問です";
			session = request.getSession(true);		//getSessionメソッドの引数trueはセッションを新規に作成して返す
			session.setAttribute("visited", "1");	//セッション情報の設定 HttpSessionの変数.setAttribute(データ名、情報)
		}else{
			String visitedStr = (String)session.getAttribute("visited");	//セッション情報の取得 HttpSessionの変数.getAttribute(データ名)
			int visited = Integer.parseInt(visitedStr) + 1;	//Integer.parseIntでint型からString型に変換
			greetingMsg = visited + "回目の訪問です。";
			session.setAttribute("visited", Integer.toString(visited));	//Integer.toString文でString型からをint型に変換
		}
		//if文else文で処理された変数を出力
		out.println("<p>" + greetingMsg + "</p>");
		out.println("<a href =/dataOperation/countSession>画面を再訪問</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
