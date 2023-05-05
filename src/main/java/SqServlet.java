import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int k = (int) req.getAttribute("kValue");
//		int k = Integer.parseInt(req.getParameter("kValue"));
//		HttpSession session = req.getSession();
//		
//		int k = (int) session.getAttribute("kValue");
		
		Cookie cookie[] = req.getCookies();
		int k=0;
		for(Cookie c:cookie) {
			System.out.println(c.getName());
			if(c.getName().equals("kValue")) {
				k = Integer.parseInt( c.getValue());
			}
		}
		
		k*=k;
		PrintWriter out = res.getWriter();
		out.println("Output is: "+ k);
	}
}

