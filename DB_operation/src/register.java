// データベースの操作 課題2

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public register() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		//insert.htmlで作ったフォームで入力した情報を取得
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String age = request.getParameter("age");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>登録内容をemployeeテーブルに登録</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>入力した情報をSQLのemployeeテーブルに登録しました</h1>");


		Connection con = null;
		try {
			//JDBCドライバの読み込み(MYSQL)
			Class.forName("com.mysql.cj.jdbc.Driver");
			//データベースへの接続				↓接続文字列,				アカウント名, ユーザー名,パスワード
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_setting", "kazuma","password");
			//接続に成功した場合のメッセージ
			System.out.println("DB接続が成功しました");
			//SQL文の実行
			String sql = "INSERT INTO employee(id,name,birthday,age)VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			//String型をint型に変換
			int i = Integer.parseInt(id);
			//条件の「?」の1番目に値を設定
			ps.setInt(1, i);

			//条件の「?」の2番目に値を設定
			ps.setString(2, name);

			//String型をDate型に変換
			Date bi = Date.valueOf(birthday);

			//条件の「?」の3番目に値を設定
			ps.setDate(3, bi);
			//String型をint型に変換
			int ag = Integer.parseInt(age);

			//条件の「?」の4番目に値を設定
			ps.setInt(4, ag);

			//INSERT文のSQL文を実行
			ps.executeUpdate();
			System.out.println("SQL文の結果の取得に成功");
			System.out.println("ID:" + i);
			System.out.println("NAME:" + name);
			System.out.println("BIRTHDAY:" + bi);
			System.out.println("AGE:" + ag);
			
			//使用が終わったら切断
			ps.close();
			System.out.println("使用が終わったので切断します");

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
}
