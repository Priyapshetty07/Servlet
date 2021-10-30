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
		
		String FounderName = request.getParameter("FounderName");
		System.out.println("Hospital Founder Name ".concat(FounderName));
		
		String EstDate = request.getParameter("EstDate");
		System.out.println("Hospital Established Date ".concat(EstDate));
		
		String ChiefDoctor = request.getParameter("ChiefDoctor");
		System.out.println("ChiefDoctor in hospital".concat(ChiefDoctor));
		
	    String Specilization = request.getParameter("Specilization");
		System.out.println("Specilization in hospital".concat(Specilization));
		
		String NumberOFNurse = request.getParameter("NumberOFNurse");
		System.out.println("Number OF Nurse in hospital".concat(NumberOFNurse));
		
		String NumberOfBeds = request.getParameter("NumberOfBeds");
		System.out.println("Number OF Beds in hospital".concat(NumberOfBeds));
		
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");
		
		out.print("<h1>");
		out.print("Details saved for Hospital name :".concat(hospitalName));
		out.print("<br>");
		out.print("Details saved for Hospital Founder name :".concat(FounderName));
		out.print("<br>");
		out.print("Details saved for Hospital Established Date :".concat(EstDate));
		out.print("<br>");
		out.print("Details saved for  hospital Specilization docters :".concat(Specilization));
		out.print("<br>");
		out.print("Details saved for  hospital Chief docters :".concat(ChiefDoctor));
		out.print("<br>");
		out.print("Details saved for Number OF Nurse in hospital:".concat(NumberOFNurse));
		out.print("<br>");
		out.print("Details saved for Number OF Beds in hospital :".concat(NumberOfBeds));
		out.print("<br>");
	    out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}