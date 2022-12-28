package unit06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Info")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		
		PrintWriter out  = response.getWriter();
		out.print("<html><body>");
		out.println("이름 : ");
		out.println(name + "<br>");
		out.println("주소 : " );
		out.println(addr +"<br>");
		out.print("</body></html>");
	}

}
