package ru.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.springapp.entities.Product;
import ru.springapp.service.ProductService;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/**")
public class ProductsRestController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    private Product getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @GetMapping("/products")
    private List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    private Product addProduct(@RequestBody Product product) {
        product = productService.saveOrUpdateProduct(product);
        return product;
    }

    @PutMapping("/products")
    private Product updateProduct(@RequestBody Product product) {
        product = productService.saveOrUpdateProduct(product);
        return product;
    }

    @DeleteMapping("/products/{id}")
    private int deleteProduct(@PathVariable Integer id) {
        productService.deleteProductById(id);
        return HttpStatus.OK.value();
    }

}