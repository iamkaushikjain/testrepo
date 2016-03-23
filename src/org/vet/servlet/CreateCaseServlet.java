package org.vet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.vet.entity.Case;
import org.vet.service.CaseService;

/**
 * Servlet implementation class CreateCase
 */
public class CreateCaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String description=request.getParameter("description");
		String symptoms=request.getParameter("symptoms");
		String status=request.getParameter("status");
		
		RequestDispatcher rd=null;
		if(CaseService.createCase(new Case(description, symptoms, status)))
		{
			rd=request.getRequestDispatcher("casedetails.jsp");
		}
		else
		{
			rd=request.getRequestDispatcher("createcase.jsp");
		}
		rd.forward(request, response);
	}

}
