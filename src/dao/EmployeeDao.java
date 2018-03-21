package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeDao {

	public List<Employee> findAll() {
		
		Connection conn = null;
		
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
			
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:file:~/work/DB/example", "sa", "");
			
			//sql文を用意
			String sql = "select id, name, age from employee";
			
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			//sql文を実行し取得
			ResultSet rs = pStmt.executeQuery();
			
			//結果をListに追加
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				Employee employee = new Employee(id, name, age);
				empList.add(employee);
			}
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
				return null;
			}
		}
		return empList;
	}
}
