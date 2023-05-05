import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int num3 = num1+num2;
		
//		res.sendRedirect("sq?kValue="+num3); //URL rewriting
		
//		HttpSession session = req.getSession();
//		session.setAttribute("kValue", num3);
//		res.sendRedirect("sq");
		
		Cookie cookie = new Cookie("kValue",num3+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
//		req.setAttribute("kValue", num3);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
	}
}

