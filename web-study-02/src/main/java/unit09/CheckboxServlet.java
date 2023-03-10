package unit09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String[] items = request.getParameterValues("item");
		out.print(items);
		if(items == null) {
			out.print("선택한 항목이 없습니다. " );
		}else {
			out.println("당신이 선택한 항목입니다.<br>");
			for(String item : items)
				out.print(item + " , ");
		}
		System.out.println(request.getContextPath());
		out.close();
	}

}
