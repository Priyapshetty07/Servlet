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

		String albumName = request.getParameter("albumName");
		System.out.println("Album Name ".concat(albumName));

		String singerName = request.getParameter("singerName");
		System.out.println("Singer Name ".concat(singerName));

		String lyrisct = request.getParameter("lyrisct");
		System.out.println("Singer Name ".concat(lyrisct));

		String language = request.getParameter("language");
		System.out.println("Singer Name ".concat(language));

		System.out.println("starting to write response");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FFC0CB'>");

		out.print("<h1>");
		out.print("Details saved for AlbumName  :".concat(albumName));
		out.print("<br>");
		out.print("Details saved for Singer Name :".concat(singerName));
		out.print("<br>");
		out.print("Details saved for Lyrisct :".concat(lyrisct));
		out.print("<br>");
		out.print("Details saved for Language:".concat(language));
		out.print("<br>");

		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");

	}

}
