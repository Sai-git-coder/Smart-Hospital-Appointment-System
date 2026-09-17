package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		int id = Integer.parseInt(req.getParameter("id"));

		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db", "root", "root");

			ServletContext context = getServletContext();

			conn = DatabaseServlet.getConnection(context);
			String query = "select p.patient_name," + "a.doctor_name," + "a.department," + "a.appointment_date,"
					+ "a.appointment_time," + "a.status" + "from patient p" + "INNER JOIN appointment a"
					+ "ON p.patient_id=a.patient_id" + "where p.patient_id=?";
			pstmt = conn.prepareStatement(query);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				String pname = req.getParameter("");
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
