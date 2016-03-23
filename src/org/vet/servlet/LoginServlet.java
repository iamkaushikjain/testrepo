package org.vet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.vet.entity.User;
import org.vet.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession(true);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		RequestDispatcher rd=null;
		
		String role=UserService.FindUser(new User(username,password));
		session.setAttribute("uname", username);
		
		if("gpo".equals(role))
		{
			rd=request.getRequestDispatcher("gpotasks.jsp");
		}		
		else if("doctor".equals(role))
		{
			rd=request.getRequestDispatcher("tasks.jsp");
		}
		else if("fo".equals(role))
		{
			rd=request.getRequestDispatcher("fieldofficer.jsp");
		}
		rd.forward(request, response);
	}

}
