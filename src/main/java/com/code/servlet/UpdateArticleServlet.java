package com.code.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateArticleServlet
 */
@WebServlet("/Article/update")
public class UpdateArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ArticleService ArticleService = new ArticleServiceImpl();
    /**
     * Default constructor. 
     */
    public UpdateArticleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("ArticleId");
        Article Article = ArticleService.getArticleById(Integer.parseInt(id));
        request.setAttribute("Article", Article);
        request.getRequestDispatcher("/WEB-INF/view/Article-form.jsp").forward(request,response);
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
