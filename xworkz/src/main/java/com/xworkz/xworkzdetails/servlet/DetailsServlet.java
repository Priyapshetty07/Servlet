package com.xworkz.xworkzdetails.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.jdbc.connection.DatebaseConnection;

public class DetailsServlet extends HttpServlet {

	public DetailsServlet() {
		System.out.println("invoked no-args constructor in DeatilsServlet");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("invoked service in Details Servlet");
		
		try {
			  
            // Initialize the database
            Connection connection = DatebaseConnection.initializeDatabase();
  
            // Create a SQL query to insert data into demo table
           
            PreparedStatement statement = connection.prepareStatement("insert into details_xworkz_servlet values(?,?,?,?)");
  
            // For the first parameter,
            // get the data using request object
            // sets the data to st pointer
            statement.setString(1, request.getParameter("name"));
            statement.setString(2, request.getParameter("type"));
            statement.setString(3, request.getParameter("yop"));
            statement.setString(4, request.getParameter("education"));
            
            System.out.println(request.getParameter("name"));
            System.out.println(request.getParameter("type"));
            System.out.println(request.getParameter("yop"));
            System.out.println(request.getParameter("education"));
            // Execute the insert command using executeUpdate()
            // to make changes in database
            
            statement.executeUpdate();
  
            // Close all the connections
            statement.close();
            connection.close();
            
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("Register Success!!!!!!!!!");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		}
		catch (Exception e) {
	        e.printStackTrace();

	 }
		
	}		

//		String name = request.getParameter("name");
//		String type = request.getParameter("type");
//		String yop = request.getParameter("yop");
//		String education = request.getParameter("education");
//
//		System.out.println("Name:" + name);
//		System.out.println("Type:" + type);
//		System.out.println("Year Of Passout:" + yop);
//		System.out.println("Education:" + education);
//
//		response.setContentType("text/html");
//		PrintWriter writer = response.getWriter();
//
//		writer.print("<html>");
//		writer.print("<body>");
//		writer.print("<h1>");
//		writer.print("Register Success!!!!!!!!!");
//		writer.print("</h1>");
//		writer.print("</body>");
//		writer.print("</html>");
//	}
}


