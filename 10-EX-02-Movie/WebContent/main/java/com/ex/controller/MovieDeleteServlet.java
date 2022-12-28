package com.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.dao.MovieDAO;
import com.ex.dto.MovieVO;

@WebServlet("/MovieDelete.do")
public class MovieDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code = Integer.parseInt(request.getParameter("code"));
		
		MovieDAO dao = MovieDAO.getInstance();
		MovieVO vo = dao.selectMovieByCode(code);
		request.setAttribute("movie", vo);
		RequestDispatcher dis =  request.getRequestDispatcher("movie/movieDelete.jsp");
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code = Integer.parseInt(request.getParameter("code"));
		MovieDAO dao = MovieDAO.getInstance();
		dao.deleteMovie(code);
		
		response.sendRedirect("List");
	}

}
