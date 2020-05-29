// データベースの操作 課題1
package db_operation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		Connection con = null;
		try {
			//JDBCドライバの読み込み(MYSQL)
			Class.forName("com.mysql.cj.jdbc.Driver");
			//データベースへの接続
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_setting", "kazuma","password");
			//接続に成功した場合のメッセージ
			System.out.println("DB接続が成功しました。");
		} catch(SQLException e) {
			//DB接続やSQL処理失敗時の処理
			e.printStackTrace();
			System.out.println("DB接続もしくはSQL処理に失敗しました");
		} catch (ClassNotFoundException e) {
			//JDBCドライバが見つからない時の処理
			e.printStackTrace();
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
