package sys.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.vo.customerVo;
import sys.dao.customerDao;

@WebServlet("/csupdate")
public class CustomerUpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("customerNum"));
		customerDao dao=new customerDao();
		customerVo vo=dao.getinfo(num);
		req.setAttribute("vo",vo);
		req.getRequestDispatcher("/csupdate.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(req.getParameter("customerNum"));
		int writer=Integer.parseInt(req.getParameter("writer"));
		String title =req.getParameter("title");
		String content =req.getParameter("content");	
		
		customerVo vo=new customerVo(num, title, content, 0, 0, 0, null, writer);
		customerDao dao=new customerDao();
		int n=dao.update(vo);
		
		if(n>0) {
			req.setAttribute("result", "success");
		}else {
			req.setAttribute("result", "fail");
		}
		req.getRequestDispatcher("/csresult.jsp").forward(req, resp);
	
	}
}











