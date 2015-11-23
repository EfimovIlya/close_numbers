package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Project301Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		String var3=req.getParameter("var3");
		boolean d= var3.contains(","); 
		if(d==true) var3=var3.replace(',','.');
		Double a=Double.parseDouble(var3);
		
		String var4=req.getParameter("var4");
		d= var4.contains(","); 
		if(d==true)var4=var4.replace(",", ".");
		Double c=Double.parseDouble(var4);
		
		if(Math.abs(a-10)<Math.abs(c-10))
		resp.getWriter().println("Blejlejashie chislo"+" "+a);
		else resp.getWriter().println("Blejlejashie chislo"+" "+c);
	}
}
