package ru.springapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.springapp.entities.Category;
import ru.springapp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Category.class)
                .buildSessionFactory();
        sessionFactory.openSession();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Category> categories = session.createQuery("from Category").getResultList();
    }
}
