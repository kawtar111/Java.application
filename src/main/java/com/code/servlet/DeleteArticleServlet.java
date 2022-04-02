package com.code.servlet;


import java.io.IOException;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


/**
 * Servlet implementation class DeleteArticleServlet
 */
@WebServlet("/Article/delete")
public class DeleteArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 // private ArticleService ArticleService = new ArticleServiceImpl();
    /**
     * Default constructor. 
     */
    public DeleteArticleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("ArticleId");
        //ArticleService.deleteArticle(Integer.parseInt(id));
		ArticleService.deleteArticle(Integer.parseInt(id));
        response.sendRedirect("/Article/list");
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
