package com.xworkz.grocerys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GrocerysServlet extends HttpServlet{
	
	public GrocerysServlet() {
		System.out.println("Grocery Servlet created");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("invoked service in Grocery servlet");
		
		String GrocerysName = request.getParameter("GrocerysName");
		System.out.println("Grocerys Name ".concat(GrocerysName));
		
		String GroceryPrice= request.getParameter("GroceryPrice");
		System.out.println("Grocery Price ".concat(GroceryPrice));
		
		String ItemTypes= request.getParameter("ItemTypes");
		System.out.println("Grocery Item Types ".concat(ItemTypes));
		
		String Quantity= request.getParameter("Quantity");
		System.out.println("Grocery Item Types ".concat(Quantity));
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");
		
		out.print("<h1>");
		out.print("Details saved for Grocerys Name :".concat(GrocerysName));
		out.print("<br>");
		out.print("Details saved for Grocery Price :".concat(GroceryPrice));
		out.print("<br>");
		out.print("Details saved for Grocery Item  Types :".concat(ItemTypes));
		out.print("<br>");
		out.print("Details saved for Grocery Quantity :".concat(Quantity));
		out.print("<br>");
		
	    out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}

