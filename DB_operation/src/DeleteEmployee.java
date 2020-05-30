// データベースの操作 課題5

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public DeleteEmployee() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");

		Connection con = null;
		try {
			//JDBCドライバの読み込み(MYSQL)
			Class.forName("com.mysql.cj.jdbc.Driver");
			//データベースへの接続				↓接続文字列,				アカウント名, ユーザー名,パスワード
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_setting", "kazuma","password");
			//接続に成功した場合のメッセージ
			System.out.println("DB接続が成功しました");
			//SQL文の実行
			String sql = "DELETE FROM employee WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			//String型をint型に変換
			int i = Integer.parseInt(id);
			//条件の「?」の1番目に値を設定
			ps.setInt(1, i);

			//INSERT文のSQL文を実行
			ps.executeUpdate();
			System.out.println("SQL文の結果の取得に成功");
			System.out.println("ID:" + i + "のレコードを削除しました");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<title>入力したIDをSQLの対象レコードに削除</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>入力したIDの対象レコードを削除しました</h1>");
			out.println("</body>");
			out.println("</html>");

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
	}
}