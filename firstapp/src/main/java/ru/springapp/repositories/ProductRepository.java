package ru.springapp.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.springapp.entities.Category;
import ru.springapp.entities.Product;
import org.springframework.stereotype.Component;
import ru.springapp.helpers.SessionCreator;


import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    public ProductRepository(){
        Session session = SessionCreator.getSession();
        session.beginTransaction();
        productList = session.createQuery("from Product").getResultList();
    }

    public List<Product> getProductList(){
        return productList;
    }

    public Product getProductById(int id){
        for (Product product: productList) {
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
