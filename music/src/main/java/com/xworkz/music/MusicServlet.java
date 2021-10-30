package com.xworkz.music;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MusicServlet extends HttpServlet {

	public MusicServlet() {
		System.out.println("Music Servlet created");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("invoked service in Music servlet");

		String AlbumName = request.getParameter("AlbumName");
		System.out.println("Album Name ".concat(AlbumName));

		String SingerName = request.getParameter("SingerName");
		System.out.println("Singer Name ".concat(SingerName));

		String Lyrisct = request.getParameter("Lyrisct");
		System.out.println("Singer Name ".concat(Lyrisct));

		String Language = request.getParameter("Language");
		System.out.println("Singer Name ".concat(Language));

		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");

		out.print("<h1>");
		out.print("Details saved for AlbumName  :".concat(AlbumName));
		out.print("<br>");
		out.print("Details saved for Singer Name :".concat(SingerName));
		out.print("<br>");
		out.print("Details saved for Lyrisct :".concat(Lyrisct));
		out.print("<br>");
		out.print("Details saved for Language:".concat(Language));
		out.print("<br>");

		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");

	}

}
