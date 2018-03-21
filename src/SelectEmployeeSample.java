import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployeeSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Connection conn = null;
		try {
			//JDBCドライバを読み込み
			Class.forName("org.h2.Driver");
			
			//データベースへ接続
			conn = DriverManager.getConnection("jdbc:h2:file:~/work/DB/example", "sa", "");
			
			//select文を用意
			String sql = "select id, name, age from employee";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			//sql文を実行
			ResultSet rs = pStmt.executeQuery();
			
			//結果を表示
			while(rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				String age = rs.getString("AGE");
				
				//取得データを表示
				System.out.println("ID:" + id);
				System.out.println("NAME:" + name);
			System.out.println("AGE" + age + "\n");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			//データベース切断
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

}
