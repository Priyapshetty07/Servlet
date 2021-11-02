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

		String sweetName = request.getParameter("sweetName");
		System.out.println("Sweet name ".concat(sweetName));

		String sweetOrigin = request.getParameter("sweetOrigin");
		System.out.println("Sweet Origin ".concat(sweetOrigin));

		String sweetColor = request.getParameter("sweetColor");
		System.out.println("Sweet Color ".concat(sweetColor));

		String sweetQuantity = request.getParameter("sweetQuantity");
		System.out.println("Sweet Quantity ".concat(sweetQuantity));

		String sweetPrice = request.getParameter("sweetPrice");
		System.out.println("Sweet Price ".concat(sweetPrice));

		String sweetTaste = request.getParameter("sweetTaste");
		System.out.println("Sweet Taste ".concat(sweetTaste));

		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");

		out.print("<h1>");
		out.print("Details saved for Sweet Name  :".concat(sweetName));
		out.print("<br>");
		out.print("Details saved for Sweet Origin :".concat(sweetOrigin));
		out.print("<br>");
		out.print("Details saved for Sweet Color :".concat(sweetColor));
		out.print("<br>");
		out.print("Details saved for Sweet Quantity :".concat(sweetQuantity));
		out.print("<br>");
		out.print("Details saved for Sweet Price :".concat(sweetPrice));
		out.print("<br>");
		out.print("Details saved for Sweet Taste :".concat(sweetTaste));
		out.print("<br>");

		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}
}
