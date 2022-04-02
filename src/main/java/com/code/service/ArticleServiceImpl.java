package com.code.service;
import java.util.List;

import com.code.model.Article;
import com.code.dao.ArticleDAO;
import com.code.dao.HibernateArticleDAO;
public class ArticleServiceImpl implements ArticleService {
	private ArticleDAO ArticleDAO = new HibernateArticleDAO();

    @Override
    public List<Article> getArticles() {
        return ArticleDAO.getArticles();
    }

    @Override
    public void addArticle(Article Article) {
    	ArticleDAO.addArticle(Article);
    }

    @Override
    public void deleteArticle(int id) {
    	ArticleDAO.deleteArticle(id);
    }

    @Override
    public Article getArticleById(int id) {
        return ArticleDAO.getArticleById(id);
    }
}
