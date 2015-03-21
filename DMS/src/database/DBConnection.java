package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import view.DormWindow;
import background.Dorm;
import background.EmergencyContact;
import background.Room;
import background.School;
import background.Student;

public class DBConnection {
	Connection con = null;
	CallableStatement proc_stmt;
	DormWindow dormWin;
	private ArrayList dorms;

	public DBConnection() {

	}

	public Connection connect() throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:sqlserver://192.168.234.1:1433;instance=MSSQLSERVER;DatabaseName=DormManagement";

		con = DriverManager.getConnection(url, "sa", "123456");
		return con;
	}

	public boolean insertRoomType(Room room) {
		try {

			proc_stmt = connect().prepareCall("{ call Insert_RoomType(?,?) }");
			proc_stmt.setInt(1, room.getRoomNo());
			proc_stmt.setDouble(2, room.getRoomPrice());

			proc_stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean insertDorm(Dorm dorm) throws SQLException {
		try {
			proc_stmt = connect().prepareCall("{ call Insert_Dorm(?,?) }");
			proc_stmt.setString(1, dorm.getDormName());
			proc_stmt.setString(2, dorm.getLocation());

			proc_stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public boolean insertRoom(Room room) throws SQLException {

		try {
			proc_stmt = connect().prepareCall("{ call Insert_Room(?,?,?) }");
			proc_stmt.setString(1, room.getTypeName());
			proc_stmt.setDouble(2, room.getRoomPrice());
			proc_stmt.setInt(3, room.getRoomNo());

			proc_stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public boolean insertStudent(Student st, EmergencyContact ec, School sc)
			throws SQLException {
		connect();
		try {
			proc_stmt = con.prepareCall("{ call Insert_Student(?,?,?,?,) }");
			proc_stmt.setString(1, sc.getUniName());
			proc_stmt.setString(2, sc.getDepartment());
			proc_stmt.setInt(3, sc.getGrade());
			proc_stmt.setString(4, ec.getName());
			proc_stmt.setString(5, ec.getSurname());
			proc_stmt.setString(6, ec.getPhone());
			proc_stmt.setString(7, st.getName());
			proc_stmt.setString(8, st.getSurname());
			proc_stmt.setString(9, st.getEmail());
			proc_stmt.setString(10, st.getPhone());
			proc_stmt.setString(11, st.getGender());
			proc_stmt.setString(13, st.getTC());
			proc_stmt.setString(12, st.getBirthday());

			proc_stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
	
	public void retrieveDormInfo() {
		try {
			connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		try {
			dorms = new ArrayList<>();
			//Statement stmt = con.createStatement();
		    //String query = "SELECT * FROM Dorm";

		    //ResultSet rs = stmt.executeQuery(query);
			pstmt  = con.prepareStatement("select * from Dorm");
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				dorms.add(rs.getString("DormName") + " - " + rs.getString("Location"));
			}
			
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void retrieveRoomID() {
		
	}
	
	public static void closeStatement(Statement statement) {
		// TODO Auto-generated method stub

	}

	public static void closeConnection(Connection connection) {
		// TODO Auto-generated method stub

	}

	public ArrayList getDorms() {
		return dorms;
	}
	
}
