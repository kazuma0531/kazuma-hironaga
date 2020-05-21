// データ操作 （GETとPOST）課題 1

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public Result() {
		super();

	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String textbox = request.getParameter("name");
		String gender = request.getParameter("gender");
		String help = request.getParameter("help");
		String comeent = request.getParameter("comeent");
		PrintWriter out = response.getWriter();

		if (null == gender) {
			gender = "";
		}
		if ("male".equals(gender)) {
			gender = "男性";
		} else if ("female".equals(gender)) {
			gender = "女性";
		}

		if ("a".equals(help)) {
			help = "製品について";
		} else if ("b".equals(help)) {
			help = "不具合やクレーム";
		} else if ("c".equals(help)) {
			help = "アフターサポート";
		}
		out.println("<html>");
		out.println("<head>");
		out.println("<title>あなたの回答</title>");
		out.println("</head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<body>");
		out.println("<p>以下の内容でお問合せしました。回答をお待ちください。</p>");
		out.println("<p>名前:" + textbox + "様</p>");
		out.println("<p>性別:" + gender +"</p>");
		out.println("<p>お問い合わせ種類:" + help + "</p>");
		out.println("<p>お問い合わせ内容:" + comeent + "</p>" );
		out.println("</body>");
		out.println("</html>");
	}
}
