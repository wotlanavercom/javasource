package board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.action.Action;
import board.action.ActionForward;
import board.action.BoardActionFactory;


@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//주소줄에서 명령어 분리
		//전체 주소줄 가져오기
		String requestURI = request.getRequestURI();
		//context 명 가져오기
		String contextPath = request.getContextPath();
		//명령어 분리
		String cmd = requestURI.substring(contextPath.length());
		
		//액션 생성
		BoardActionFactory baf = BoardActionFactory.getInstance();
		Action action = baf.action(cmd);
		
		ActionForward af = null;
		
		try {
			af = action.execute(request);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (af.isRedirect()) {
			response.sendRedirect(af.getPath());
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(af.getPath());
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
