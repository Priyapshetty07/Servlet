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

		String countryName = request.getParameter("countryName");
		System.out.println("Country Name".concat(countryName));

		String code = request.getParameter("code");
		System.out.println("Country Code ".concat(code));

		String population = request.getParameter("population");
		System.out.println("Country Population ".concat(population));

		String language = request.getParameter("language");
		System.out.println("Country Language".concat(language));

		String capital = request.getParameter("capital");
		System.out.println("Country Capital ".concat(capital));

		String primeMinister = request.getParameter("primeMinister");
		System.out.println("Country PrimeMinister ".concat(primeMinister));

		String president = request.getParameter("president");
		System.out.println("Country President ".concat(president));

		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");

		out.print("<h1>");
		out.print("Details saved for Country Name :" + (countryName));
		out.print("<br>");
		out.print("Details saved for Country code :" + (code));
		out.print("<br>");
		out.print("Details saved for Country population:" + (population));
		out.print("<br>");
		out.print("Details saved for Country Language :" + (language));
		out.print("<br>");
		out.print("Details saved for Country Capital :" + (capital));
		out.print("<br>");
		out.print("Details saved for Country PrimeMinister :" + (primeMinister));
		out.print("<br>");
		out.print("Details saved for Country  President :" + (president));
		out.print("<br>");

		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}
