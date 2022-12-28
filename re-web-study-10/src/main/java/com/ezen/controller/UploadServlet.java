package com.ezen.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//���⸦ �ٲ��ָ� �ٿ�޴� ��ΰ� �ٲ� (upload)
		String savePath = "upload";
		
		//�ִ� ���ε� ���� ũ�� 5MB�� ��ȯ
		int uploadFileSize = 5*1024*1024;
		String encType ="UTF-8";
		
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		System.out.println("�������� ���� ���丮: ");
		System.out.println(uploadFilePath);
		
		try {
			MultipartRequest multi = new MultipartRequest(
					request, //request ��ü
					uploadFilePath, //�������� ���� ���丮
					uploadFileSize, //�ִ� ���ε� ���� ũ��
					encType, //���ڵ� ���
					//������ �̸��� �����ϸ� ���ο� �̸��� �ο���
					new DefaultFileRenamePolicy());
			//���ε�� ������ �̸� ���
			String fileName = multi.getFilesystemName("uploadFile");
			
			if (fileName == null) {	//������ ���ε� ���� �ʾ�����
				System.out.print("������ ���ε� ���� �ʾҽ��ϴ�.");
			}
			else {	//������ ���ε� �Ǿ�����	
				out.println("<br> �۾��� : " + multi.getParameter("name"));
				out.println("<br> �� �� : " + multi.getParameter("title"));
				out.println("<br> ���ϸ� : " + fileName);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}	
		
	}


}
