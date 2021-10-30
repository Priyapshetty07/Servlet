package com.xworkz.sweet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SweetServlet extends HttpServlet {

	public SweetServlet() {
		System.out.println("Sweet Servlet created");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("invoked service in Sweet servlet");

		String Sweetname = request.getParameter("Sweetname");
		System.out.println("Sweet name ".concat(Sweetname));

		String SweetOrigin = request.getParameter("SweetOrigin");
		System.out.println("Sweet Origin ".concat(SweetOrigin));

		String SweetColor = request.getParameter("SweetColor");
		System.out.println("Sweet Color ".concat(SweetColor));

		String SweetQuantity = request.getParameter("SweetQuantity");
		System.out.println("Sweet Quantity ".concat(SweetQuantity));

		String SweetPrice = request.getParameter("SweetPrice");
		System.out.println("Sweet Price ".concat(SweetPrice));

		String SweetTaste = request.getParameter("SweetTaste");
		System.out.println("Sweet Taste ".concat(SweetTaste));

		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");

		out.print("<h1>");
		out.print("Details saved for Sweet Name  :".concat(Sweetname));
		out.print("<br>");
		out.print("Details saved for Sweet Origin :".concat(SweetOrigin));
		out.print("<br>");
		out.print("Details saved for Sweet Color :".concat(SweetColor));
		out.print("<br>");
		out.print("Details saved for Sweet Quantity :".concat(SweetQuantity));
		out.print("<br>");
		out.print("Details saved for Sweet Price :".concat(SweetPrice));
		out.print("<br>");
		out.print("Details saved for Sweet Taste :".concat(SweetTaste));
		out.print("<br>");

		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}
}
