package com.xworkz.hospitals;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HospitalServlet extends HttpServlet{
	
	public HospitalServlet() {
		System.out.println("Hospital Servlet created");
   }
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("invoked service in Hospital servlet");
		
		String hospitalName = request.getParameter("hospitalName");
		System.out.println("Hospital name ".concat(hospitalName));
		
		String founderName = request.getParameter("founderName");
		System.out.println("Hospital Founder Name ".concat(founderName));
		
		String estDate = request.getParameter("estDate");
		System.out.println("Hospital Established Date ".concat(estDate));
		
		String chiefDoctor = request.getParameter("chiefDoctor");
		System.out.println("ChiefDoctor in hospital".concat(chiefDoctor));
		
	    String specilization = request.getParameter("specilization");
		System.out.println("Specilization in hospital".concat(specilization));
		
		String numberOFNurse = request.getParameter("numberOFNurse");
		System.out.println("Number OF Nurse in hospital".concat(numberOFNurse));
		
		String numberOfBeds = request.getParameter("numberOfBeds");
		System.out.println("Number OF Beds in hospital".concat(numberOfBeds));
		
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");
		
		out.print("<h1>");
		out.print("Details saved for Hospital name :".concat(hospitalName));
		out.print("<br>");
		out.print("Details saved for Hospital Founder name :".concat(founderName));
		out.print("<br>");
		out.print("Details saved for Hospital Established Date :".concat(estDate));
		out.print("<br>");
		out.print("Details saved for  hospital Specilization docters :".concat(specilization));
		out.print("<br>");
		out.print("Details saved for  hospital Chief docters :".concat(chiefDoctor));
		out.print("<br>");
		out.print("Details saved for Number OF Nurse in hospital:".concat(numberOFNurse));
		out.print("<br>");
		out.print("Details saved for Number OF Beds in hospital :".concat(numberOfBeds));
		out.print("<br>");
	    out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}