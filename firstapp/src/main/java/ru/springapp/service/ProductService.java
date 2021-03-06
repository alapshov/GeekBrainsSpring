package ru.springapp.service;

import ru.springapp.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.springapp.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    private void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id);
    }
    public void deleteProductById(int id) {productRepository.deleteById(id);}

    public Product saveOrUpdateProduct(Product product) {
        return productRepository.save(product);
    }
}
