package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/database")
public class DatabaseServlet extends HttpServlet{

	Connection conn = null;
	
	
	public static Connection getConnection(ServletContext context)
            throws SQLException,ClassNotFoundException {

		String driver = context.getInitParameter("driver");
        String url = context.getInitParameter("url");
        String user = context.getInitParameter("username");
        String password = context.getInitParameter("password");

        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
//		
//		ServletContext context = getServletContext();
//		
//		String driver = context.getInitParameter("driver");
//		String url = context.getInitParameter("url");
//		String username = context.getInitParameter("username");
//		String password = context.getInitParameter("password");
//		
//		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url, username, password);
//			System.out.println("Database Connected Successfully");
//		} catch (ClassNotFoundException|SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	
}
