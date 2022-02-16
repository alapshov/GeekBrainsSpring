package ru.springapp.repositories;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import ru.springapp.entities.Category;
import ru.springapp.entities.Product;
import ru.springapp.helpers.SessionCreator;

import java.util.List;

@Component
public class CategoryRepository {
    private List<Category> categories;

    public CategoryRepository() {
        Session session = SessionCreator.getSession();
        session.beginTransaction();
        categories = session.createQuery("from Category").getResultList();
    }

    public List<Category> getCategories() {
        return categories;
    }

    public Category getCategoryId(int id) {
        for (Category category: categories) {
            if(category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
