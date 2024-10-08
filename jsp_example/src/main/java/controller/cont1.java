package controller;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//controller 를 만드는 방법을 순서대로 확인해보자
// Step 1 : HttpServlet 클래스를 상속
// Step 2 : 오버라이딩 실시 ( do Get(), doPost())
// Step 3 : 서블릿매핑


@WebServlet("/first")
public class cont1 extends HttpServlet 
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.printf("첫번째 페이지 입니다. \n");
		
		RequestDispatcher ds = req.getRequestDispatcher("first.jsp");
		ds.forward(req, resp);	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("두 포스트 실행됨");
	}
	
}
