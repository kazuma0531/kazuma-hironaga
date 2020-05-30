// データベースの操作 課題3

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public search() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		//search.htmlで作ったフォームで検索した情報を取得
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>検索結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<b>検索結果</b>" + "<br>");

		Connection con = null;
		try {
			//JDBCドライバの読み込み(MYSQL)
			Class.forName("com.mysql.cj.jdbc.Driver");
			//データベースへの接続				↓接続文字列,				アカウント名, ユーザー名,パスワード
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_setting", "kazuma","password");
			//接続に成功した場合のメッセージ
			System.out.println("DB接続が成功しました");
			//SQL文の実行
			String sql = "SELECT * FROM employee WHERE name LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			//条件の「?」に値を設定
			ps.setString(1,"%" + name + "%");
			//SELECT文のSQL文を結果表として取得する
			ResultSet rs = ps.executeQuery();
			//結果表に格納された情報を表示
			while(rs.next()) {
				out.println("<b>ID:</b>" + rs.getInt("id") + "<br>");
				out.println("<b>名前:</b>" + rs.getString("name")+ "<br>");
				out.println("<b>生年月日:</b>" + rs.getDate("birthday")+ "<br>");
				out.println("<b>年齢:</b>" + rs.getInt("age")+ "<br>");
				
			}
			ps.close();
			rs.close();
		} catch(SQLException e) {
			//DB接続やSQL処理失敗時の処理
			e.printStackTrace();
			System.out.println("DB接続もしくはSQL処理に失敗しました");
		} catch (ClassNotFoundException e) {
			//JDBCドライバが見つからない時の処理
			e.printStackTrace();
			System.out.println("JDBCドライバが見つかりませんでした");
		} finally {
			//データベースの切断
			if(con != null) {
				try {
					con.close();
					System.out.println("データベースの切断に成功しました");
				} catch (SQLException e) {
					//DB切断失敗時の処理
					e.printStackTrace();
					System.out.println("データベースの切断に失敗しました");
				}
			}
		}
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
}