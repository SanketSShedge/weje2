package com.jspiders.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetStudent
 */
@WebServlet("/studentreg")
public class GetStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudent() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String course = request.getParameter("course");
		String place = request.getParameter("place");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","root");
			String query = "insert into studentdetails(name,email,contact,course,place) values(?,?,?,?,?)";
			
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email); 
			preparedStatement.setString(3, contact);
			preparedStatement.setString(4, course);
			preparedStatement.setString(5, place);		
			
			preparedStatement.executeUpdate();
			writer.println("<h2>"+name+" record saved...</h2>");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}


