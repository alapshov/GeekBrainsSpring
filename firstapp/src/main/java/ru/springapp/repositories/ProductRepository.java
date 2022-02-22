package ru.springapp.repositories;

import ru.springapp.entities.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    public ProductRepository(){
        productList = Arrays.asList(
                new Product(1, "Продукт 1", 50.0),
                new Product(2, "Продукт 2", 120.0),
                new Product(3, "Продукт 3", 130.0),
                new Product(4, "Продукт 4", 140.0),
                new Product(5, "Продукт 5", 150.0),
                new Product(6, "Продукт 6", 160.0),
                new Product(7, "Продукт 7", 170.0),
                new Product(8, "Продукт 8", 180.0),
                new Product(9, "Продукт 9", 190.0),
                new Product(10, "Продукт 10", 100.0)
        );
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
