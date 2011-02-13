package battleCruiser.server;

import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.net.*;

/**
 * 5 tuple protocol: udp / tcp source & destination ip and port
 * 
 * bcAlpha Server for BattleCruiser 1. setup maps 2. connect to database 3.
 * handle connections a. open port, wait for packets? or rmi methods? rmi: ???
 * ports: open port wait for connection verify correct data packet strip header
 * and pass to a parser with user id
 * 
 * 
 * @author Jeff
 * 
 */
public class BcAlpha {
	private static int PORT = 27000;
	private static String SERVER = "127.0.0.1";

	// open socket
	public BcAlpha() {
		try {
			Socket s = new Socket(SERVER, PORT);
		} catch (Exception e) {
			System.err.println("Can't create socket, Port:" + PORT + " at "
					+ SERVER + "not available");
		}
	}

	// connect to database
	// start learning jdbc, MySQL

	// from jdbc overview: Connection con = DriverManager.getConnection
	/*
	 * ( "jdbc:myDriver:wombat", "myLogin","myPassword");
	 * 
	 * Statement stmt = con.createStatement(); ResultSet rs =
	 * stmt.executeQuery("SELECT a, b, c FROM Table1"); while (rs.next()) { int
	 * x = rs.getInt("a"); String s = rs.getString("b"); float f =
	 * rs.getFloat("c");
	 */

	Connection con;
	String query;

	public BcAlpha(String url, String user, String password) {
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error connecting to Database: " + e);
			e.printStackTrace();
		}
	}

	ResultSet executeStatement(Connection con, String query)
			throws SQLException {
		// could use connection
		Statement s = con.createStatement();
		return s.executeQuery(query);

	}
	// open the ports
	// start a thread to handle the connections and pass the data and parameters
	// to the interpreter

}