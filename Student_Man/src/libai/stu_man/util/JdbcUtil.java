package libai.stu_man.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class JdbcUtil {
	private static String driverClass = null;
	private static String url = null;
	private static String name = null;
	private static String password = null;
	static {
		try {
			Properties properties = new Properties();
			//InputStream is = new FileInputStream("jdbc.properties");
			//使用类加载器加载properties文件
			InputStream is = JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc_mysql.properties");
			//导入输入流
			properties.load(is);
			//读取属性
			driverClass = properties.getProperty("driverClass");
			url = properties.getProperty("url");
			name = properties.getProperty("name");
			password = properties.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 获取连接对象
	 * @return Connection
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//1注册驱动
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Class.forName(driverClass);
			//、建立连接(参数1：协议/要访问的数据库,连接数据库用的用户名,密码)
			//  conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=monty&password=greatsqldb");
			conn = DriverManager.getConnection(url,name,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 *  释放资源
	 * @param rs
	 * @param st
	 * @param conn
	 */
	public static void release(ResultSet rs,PreparedStatement pst,Connection conn) {
		closeRs(rs);
		closePst(pst);
		closeConn(conn);
	}
	
	
	private static void closeRs(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
		}
	}
	private static void closePst(PreparedStatement pst) {
		if(pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				pst = null;
			}
		}
	}

	private static void closeSt(Statement st) {
		if(st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				st = null;
			}
		}
	}
	
	private static void closeConn(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
	
}
