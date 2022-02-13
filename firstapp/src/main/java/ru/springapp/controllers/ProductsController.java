package ru.springapp.controllers;

import org.springframework.ui.Model;
import ru.springapp.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.springapp.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/allproducts", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    @ResponseBody
    public Product getProductById(Model model, @RequestParam int id) {
        return productService.getProductById(id);
    }

}
