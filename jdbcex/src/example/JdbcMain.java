package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JdbcMain{
	
	public static void main(String[] args) {
		JdbcMain ex=new JdbcMain();
		ex.execute();
		
	}
	
	Connection createConnection() throws SQLException{
		//Register Driver
		DriverManager.registerDriver(new OracleDriver());
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		//String url="jdbc:oracle:thin:@192.168.2.180:1521:xe";
		//creating connection
		//Connection connection = DriverManager.getConnection(url, "system", "oracle");
		
		Connection connection = DriverManager.getConnection(url, "scott", "tiger");
		System.out.println("connected.");
		return connection;
	}
	
	public void addRow()
	{
		try {
			Connection connection=createConnection();
			Statement statement=connection.createStatement();
			String sql="insert into employees(id,name) values(007,'Sourav')";
			int count=statement.executeUpdate(sql);
			System.out.println("no of rows updated="+count);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void fetchAndDisplay() {
		try {
			//creating connection
			Connection connection = createConnection();
			
			//create statement object
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from employees");
			while(resultSet.next())
			{
				int id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				System.out.println("id = "+id+" name = "+name);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void execute()
	{
		addRow();
		fetchAndDisplay();
	}
	

}
