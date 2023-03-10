package com.ezen.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/upload2.do")
public class MutiUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		PrintWriter out = response.getWriter();
		String savePath = "upload";
		int uploadfileSize = 5 * 1024 * 1024;
		String encType = "UTF-8";
		
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		
		try {
			MultipartRequest multi = new MultipartRequest(
					request,
					uploadFilePath,
					uploadfileSize,
					encType,
					new DefaultFileRenamePolicy());
			Enumeration files = multi.getFileNames();
		while (files.hasMoreElements()) {
			String file = (String) files.nextElement();
			String file_name = multi.getFilesystemName(file);
			//중복된 파일을 업로드 하는 경우 파일명이 바뀐다.
			String ori_file_name = multi.getFilesystemName(file);
			out.print("<br> 업로드된 파일명 : " + file_name);
			out.print("<br> 원본 파일명 : " + ori_file_name);
			out.print("<hr>");
			}
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
	}
}