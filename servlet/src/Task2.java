// サーブレット 課題2

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task2")	//URLを設定
public class Task2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Task2() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Date now = new Date();		//Dateクラスを設定
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");	//SimpleDateFormatクラスを設定
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title> ServletTask </title>");	//titleを設定
		out.println("</head>");
		out.println("<body>");
		out.print("<h1>" + "今日の日付: "+ sdf1.format(now) + "</h1>");		//現在時刻を出力
		out.println("</body>");
		out.println("</html>");			
	}
}
