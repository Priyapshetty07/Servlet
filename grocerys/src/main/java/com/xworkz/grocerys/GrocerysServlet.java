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
		
		String grocerysName = request.getParameter("grocerysName");
		System.out.println("Grocerys Name ".concat(grocerysName));
		
		String groceryPrice= request.getParameter("groceryPrice");
		System.out.println("Grocery Price ".concat(groceryPrice));
		
		String itemTypes= request.getParameter("itemTypes");
		System.out.println("Grocery Item Types ".concat(itemTypes));
		
		String quantity= request.getParameter("quantity");
		System.out.println("Grocery Item Types ".concat(quantity));
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");
		
		out.print("<h1>");
		out.print("Details saved for Grocerys Name :".concat(grocerysName));
		out.print("<br>");
		out.print("Details saved for Grocery Price :".concat(groceryPrice));
		out.print("<br>");
		out.print("Details saved for Grocery Item  Types :".concat(itemTypes));
		out.print("<br>");
		out.print("Details saved for Grocery Quantity :".concat(quantity));
		out.print("<br>");
		
	    out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}

