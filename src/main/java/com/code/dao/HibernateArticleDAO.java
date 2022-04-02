package com.code.dao;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.code.model.Article;
import com.code.util.HibernateUtil;

import java.util.List;
public class HibernateArticleDAO implements ArticleDAO{
	@Override
    public List<Article> getArticles() {
        Session currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        Query<Article> query = currentSession.createQuery("from Article order by lastName", Article.class);
        List<Article> Articles = query.getResultList();
        currentSession.getTransaction().commit();
        return Articles;
    }

    @Override
    public void addArticle(Article Article) {
        Session currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        System.out.println(Article);
        currentSession.saveOrUpdate(Article);
        currentSession.getTransaction().commit();
    }

    @Override
    public void deleteArticle(int id) {
        Session currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        Query query = currentSession.createQuery("delete from Article where id=:ArticleId");
        query.setParameter("ArticleId", id);
        query.executeUpdate();
        currentSession.getTransaction().commit();
    }

    @Override
    public Article getArticleById(int id) {
        Session currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
        currentSession.beginTransaction();
        Article Article = currentSession.get(Article.class, id);
        currentSession.getTransaction().commit();
        return Article;
    }
}

