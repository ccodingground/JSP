package board.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import dto.BoardDTO;

public class BoardDetailService implements Service {

	@Override
	public String porcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//listener에서  ServletContext에 등록한 boardDAO
		int no=Integer.parseInt( request.getParameter("no") );//문자열-->int로 변경
		//조회수 증가
		//detail정보 갖고오기
		BoardDAO boardDAO=(BoardDAO)request.getServletContext().getAttribute("boardDAO");
		BoardDTO dto=boardDAO.selectBoardOne(no);
		request.setAttribute("detail", dto);
		return "/WEB-INF/view/board-detail.jsp";
	}

}
