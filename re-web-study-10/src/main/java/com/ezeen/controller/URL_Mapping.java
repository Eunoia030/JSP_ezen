package com.ezeen.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.ProductDAO;
import com.ezen.dto.ProductVO;

@WebServlet({"/productList.do"})
public class URL_Mapping extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ProductDAO dao = ProductDAO.getInstance();
		
		List<ProductVO> productList = dao.selectAllProducts();
		request.setAttribute("productlist", productList);
		
		RequestDispatcher dis = request.getRequestDispatcher("product/productList.jsp");
		dis.forward(request, response);
	}
}
