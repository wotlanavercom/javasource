package comtroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.DeleteAction;
import action.InsertAction;


/**
 * Servlet implementation class patternController
 */
@WebServlet("*.do")//Url mapping : 이름은 상관없으나 끝날때는 .do 끝나야 함
public class patternController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI();
		//프로제트 == context
		String contextPath = request.getContextPath();
		String cmd = requestURI.substring(contextPath.length());
		
		System.out.println("requestURI "+requestURI);
		System.out.println("contextPath "+contextPath);
		System.out.println("cmd "+cmd);
		
		Action action = null;
		//어디서 요청이 왔는지
		if(cmd.equals("/insert.do")) {
			action = new InsertAction();
			try {
				action.execute(request);				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(cmd.equals("/list.do")){
			
		}else if(cmd.equals("/update.do")){
			
		}else if(cmd.equals("/delete.do")){
			action = new DeleteAction();
			try {
				action.execute(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
