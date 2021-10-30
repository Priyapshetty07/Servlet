package com.xworkz.country;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {

	public CountryServlet() {
		System.out.println("Country Servlet created");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("invoked service in Country servlet");

		String CountryName = request.getParameter("CountryName");
		System.out.println("Country Name".concat(CountryName));

		String Code = request.getParameter("Code");
		System.out.println("Country Code ".concat(Code));

		String Population = request.getParameter("Population");
		System.out.println("Country Population ".concat(Population));

		String Language = request.getParameter("Language");
		System.out.println("Country Language".concat(Language));

		String Capital = request.getParameter("Capital");
		System.out.println("Country Capital ".concat(Language));

		String PrimeMinister = request.getParameter("PrimeMinister");
		System.out.println("Country PrimeMinister ".concat(PrimeMinister));

		String President = request.getParameter("President");
		System.out.println("Country President ".concat(President));

		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");

		out.print("<h1>");
		out.print("Details saved for Country Name :" + (CountryName));
		out.print("<br>");
		out.print("Details saved for Country code :" + (Code));
		out.print("<br>");
		out.print("Details saved for Country population:" + (Population));
		out.print("<br>");
		out.print("Details saved for Country Language :" + (Language));
		out.print("<br>");
		out.print("Details saved for Country Capital :" + (Capital));
		out.print("<br>");
		out.print("Details saved for Country PrimeMinister :" + (PrimeMinister));
		out.print("<br>");
		out.print("Details saved for Country  President :" + (President));
		out.print("<br>");

		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}
