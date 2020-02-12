package board.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface Service {
	public String porcess(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException;
}
