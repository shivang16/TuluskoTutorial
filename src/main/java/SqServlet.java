import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int k = (int) req.getAttribute("kValue");
//		int k = Integer.parseInt(req.getParameter("kValue"));
		HttpSession session = req.getSession();
		
		int k = (int) session.getAttribute("kValue");
		
		
		k*=k;
		PrintWriter out = res.getWriter();
		out.println("Output is: "+ k);
	}
}

