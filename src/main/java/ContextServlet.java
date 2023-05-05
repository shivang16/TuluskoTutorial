import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ContextServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		
		ServletContext ctx = req.getServletContext();
		
		out.print("My name is: "+ctx.getInitParameter("name"));
	}
}

