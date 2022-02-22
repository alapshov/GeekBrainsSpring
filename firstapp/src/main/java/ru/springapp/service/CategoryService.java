package ru.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.springapp.entities.Category;
import ru.springapp.repositories.CategoryRepository;
import java.util.List;


@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    private void setProductRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category getCategoryById(int id) {
        return categoryRepository.findById(id);
    }
}
