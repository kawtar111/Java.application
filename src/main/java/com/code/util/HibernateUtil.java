package com.code.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.model.Article;
public class HibernateUtil {
	private static SessionFactory factory;

    private HibernateUtil() {}

    public static synchronized SessionFactory getSessionFactory() {
        if (factory == null) {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Article.class)
                    .buildSessionFactory();
        }
        return factory;
    }
}
