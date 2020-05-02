// サーブレット 課題4

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Task4")
public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Task4() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		Random rnd =new Random();		//ランダムクラスを処理
		String[] fortune = new String[]{"大吉","中吉","小吉","末吉","凶","大凶"};
		int index = rnd.nextInt(fortune.length);
		out.println("<p>↓ 占い結果 ↓</p>");
		out.println("<h1>" + fortune[index] + "</h1>");
		HtmlTemplate.header(out);		//HtmlTemplateメソッドから呼び出し
		HtmlTemplate.footer(out);		//HtmlTemplateメソッドから呼び出し
	}
}

/* 上記の想定結果
 * ↓ 占い結果 ↓ (pタグ)
 * 
 * (Randomクラスで処理されたfortune配列の結果) (h1タグ)
 */
