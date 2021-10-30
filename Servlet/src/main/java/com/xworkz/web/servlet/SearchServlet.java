package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {

	public SearchServlet() {
		System.out.println("created" + this.getClass());
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("invoked service from search servlet");
		response.setContentType("text/html");
		PrintWriter htmlWriter = response.getWriter();
		htmlWriter.print("<html>");
		htmlWriter.print("<body style='background-color:#FF8C00;'>");
		htmlWriter.print("<h1 align='center';>");
		htmlWriter.print("This My First Search Link");
		htmlWriter.print("</h1>");
		htmlWriter.print("<a href='http://localhost:8089/Server/'>HOME</a>");
		htmlWriter.print("<footer style='text-align:center;margin-top:43%;'>");
		htmlWriter.print("<h2>This is footer<h2>");
		htmlWriter.print("</footer>");
		htmlWriter.print("</html>");

	}
}
