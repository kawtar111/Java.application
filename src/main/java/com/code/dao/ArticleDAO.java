package com.code.dao;
import java.util.List;

import com.code.model.Article;
public interface ArticleDAO {
	List<Article> getArticles();
    void addArticle(Article article);
    void deleteArticle(int id);
    Article getArticleById(int id);
}
