package unit05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExamServlet")
public class ExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String hak = request.getParameter("hak");
		String name = request.getParameter("name");
		int java = Integer.parseInt(request.getParameter("java"));
		int jsp = Integer.parseInt(request.getParameter("jsp"));
		int spring = Integer.parseInt(request.getParameter("spring"));
		int tot = java+jsp+spring;
		int avg = tot/3;
		PrintWriter prn = response.getWriter();
		prn.println("<html><body>");
		prn.println("학 번 : "); 
		prn.println(hak + "<br>");
		prn.println("이 름  : "); 
		prn.println(name + "<br>");
		prn.println("총점 : "); 
		prn.println(tot + "<br>");
		prn.println("평균 : "); 
		prn.println(avg + "<br>");
		prn.println("</body></html>");
	}

}
