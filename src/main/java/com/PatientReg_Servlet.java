package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class PatientReg_Servlet extends HttpServlet {

	Connection conn = null;
	PreparedStatement pstmt = null;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String phone = req.getParameter("phone");
		String disease = req.getParameter("disease");

		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			
			ServletContext context = getServletContext();
			
			conn = DatabaseServlet.getConnection(context);
			
			pstmt = conn.prepareStatement(
					"insert into hospital_db.patient(patient_id,patient_name,age,phone,problem)values(?,?,?,?,?)");

			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setString(4, phone);
			pstmt.setString(5, disease);

			pstmt.executeUpdate();

			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<div style='text-align: center;'>");
			out.println(
					"<h1 style='color: darkgreen; background-color: lightgreen; width: 300px; margin: auto;'>Successfully Registered</h1>");
			out.println("</div>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}

		}
	}
}
