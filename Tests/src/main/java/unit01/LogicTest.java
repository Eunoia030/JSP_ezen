package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogicTest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int sum = 0;
		for(int i=0; i<=100; i++)
			sum +=i;
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html><body>");
		out.println(sum);
		out.println("</body></html>");
	}
}
