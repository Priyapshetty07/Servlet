package com.xworkz.fridge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LGServlet extends HttpServlet{

	public LGServlet ()
	{
		System.out.println("Created LG Servlet");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String brand = request.getParameter("brand");
		String color = request.getParameter("color");
		String price = request.getParameter("price");

		System.out.println("Brand:" + brand);
		System.out.println("Color:" + color);
		System.out.println("Price:" + price);

		response.setContentType("text/html");
		PrintWriter htmlWriter = response.getWriter();
		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1 align='center';>");
		htmlWriter.print("Saved Sucessfully for :" + brand);
		htmlWriter.print("</h1>");
		htmlWriter.print("<body>");
		htmlWriter.print("<html>");
	}

}

