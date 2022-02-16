package ru.springapp.helpers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.springapp.entities.Category;
import ru.springapp.entities.Product;

public class SessionCreator {
    public static Session getSession(){
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Category.class)
                .buildSessionFactory();
        sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }
}
