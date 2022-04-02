package com.code.service;
import java.util.List;

import com.code.model.Article;

public interface ArticleService {
	List<Article> getArticles();
    void addArticle(Article article);
    void deleteArticle(int id);
    Article getArticleById(int id);
}
