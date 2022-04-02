package com.code.servlet;


import com.code.model.Article;
import com.code.service.ArticleService;
import com.code.service.ArticleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Article/add")
public class AddArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArticleService ArticleService = (ArticleService) new ArticleServiceImpl();
    public AddArticleServlet() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/Article-form.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Article Article = new Article();

        if (request.getParameter("ArticleId") != null && !request.getParameter("ArticleId").isEmpty()) {
            Article.setId(Integer.parseInt(request.getParameter("ArticleId")));
        }

        Article.setNomArticle(request.getParameter("NomArticle"));
        Article.setNomAuteur(request.getParameter("NomAuteur"));
        Article.setDatePub(request.getParameter("DatePub"));
        Article.setTexte_Article(request.getParameter("texte_Article"));
        Article.setPhoto(request.getParameter("photo"));

        ArticleService.addArticle(Article);
        response.sendRedirect("/Article/list");
	}

}
