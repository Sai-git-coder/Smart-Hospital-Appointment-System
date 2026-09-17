package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/appointment")
public class AppointmentServlet extends HttpServlet {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		int aid = Integer.parseInt(req.getParameter("aid"));
		int pid = Integer.parseInt(req.getParameter("pid"));
		String name = req.getParameter("dname");
		String dept = req.getParameter("dept");
		Date adate = Date.valueOf(req.getParameter("adate"));
		String time = req.getParameter("atime");
		if (time.length() == 5) {
			time = time + ":00";
		}
		Time atime = Time.valueOf(time);

		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db", "root", "root");

			ServletContext context = getServletContext();

			conn = DatabaseServlet.getConnection(context);
			pstmt = conn.prepareStatement("select * from patient where patient_id=?");

			pstmt.setInt(1, pid);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				pstmt = conn.prepareStatement(
						"Insert into appointment(appointment_id,patient_id,doctor_name,department,appointment_date,appointment_time,status) values(?,?,?,?,?,?,?)");

				pstmt.setInt(1, aid);
				pstmt.setInt(2, pid);
				pstmt.setString(3, name);
				pstmt.setString(4, dept);
				pstmt.setDate(5, adate);
				pstmt.setTime(6, atime);
				pstmt.setString(7, "Confirmed");

				int result = pstmt.executeUpdate();

				if (result > 0) {
					out.println(
							"<h1 style='color: darkgreen; background-color: lightgreen; width: 300px; margin: auto;'>Appointment Booked Successfully</h1>");
				}
			} else {

				out.println("<h1 style='color:red;line-height=5px'>Patient Not Found</h1>");
				out.println("<h2 style='line-height=5px'>Please register the patient first.</h2>");

				RequestDispatcher rd = req.getRequestDispatcher("reg.html");
				rd.include(req, res);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
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
