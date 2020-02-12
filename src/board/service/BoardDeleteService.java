package board.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.Service;
import dao.BoardDAO;

public class BoardDeleteService implements Service {

	@Override
	public String porcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* uri의 쿼리스트링으로 넘어온 no값 갖고오자  request.getParameter(name)*/
		int no=Integer.parseInt( request.getParameter("no") );
		
		BoardDAO dao=(BoardDAO)request.getServletContext().getAttribute("boardDAO");
		dao.deleteBoard(no);
		
		//페이지 이동
		response.sendRedirect("board-list.bo");
		return null;
	}

}
