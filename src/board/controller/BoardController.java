package board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.BoardDeleteService;
import board.service.BoardDetailService;
import board.service.BoardListService;
import board.service.Service;
// http://localhost:8080/JSP-MVC-05/board/board-list.bo
@WebServlet(urlPatterns = {"*.bo"})
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("BoardController 처리");
		/* 요청URI주소파악 */
		String uri=request.getRequestURI();
		System.out.println(uri);
		/* uri 쪼개기 */
		String[] uris=uri.split("/");
		String key=uris[uris.length-1];//uris배열의 제일마지막 인덱스의 문자열
		
		Service service=null;
		if(key.equals("board-list.bo")) {
			/* 처리할 Service 지정 */
			service=new BoardListService();
			
		}else if(key.equals("board-detail.bo")) {
			service=new BoardDetailService();
		}else if(key.equals("board-delete.bo")) {
			service=new BoardDeleteService();
		}else if(key.equals("board-write-page.bo")) {
			service=new BoardWritePageService();
		}
		//Service 실행후 이동할 주소 path에 저장
		String path=null;
		if(service!=null) {
			path=service.porcess(request, response);
			//1차처리지점.......
		}
		
		//주소이동
		if(path != null) {
			request.getRequestDispatcher(path).forward(request, response);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
