package com.code.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Article/list")
public class ArticleListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ArticleListServlet() {}
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("Articles", ArticleService.getArticles());
        request.getRequestDispatcher("/WEB-INF/view/list-Articles.jsp").forward(request,response);
    }
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
