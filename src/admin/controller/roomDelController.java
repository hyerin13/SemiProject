package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.dao.roomDao;
@WebServlet("/roomDel")
public class roomDelController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int roomSerialNum=Integer.parseInt(req.getParameter("roomSerialNum"));
		roomDao dao=roomDao.getInstance();
		dao.delete(roomSerialNum);
		req.getRequestDispatcher("/roomlist").forward(req, resp);
	}
}
