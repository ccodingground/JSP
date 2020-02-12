package board.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.BoardDAO;
import dto.BoardDTO;

public class BoardListService implements Service {

	@Override
	public String porcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 로직처리하자..
		// db처리는 DAO 에 위임
		BoardDAO boardDAO=(BoardDAO)request.getServletContext().getAttribute("boardDAO");
		List<BoardDTO> list=boardDAO.selectBoardList();
		
		request.setAttribute("list", list);
		//페이지 이동 주소설정은 returnValue 로 설정
		//주소 앞에 '/'--->contextPath (WebContent위치)입니다.
		return "/WEB-INF/view/board-list.jsp";
	}

}
