package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.Service;

public class BoardWritePageService implements Service {

	@Override
	public String porcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		return "/WEB-INF/view/board-write.jsp";
	}

}
