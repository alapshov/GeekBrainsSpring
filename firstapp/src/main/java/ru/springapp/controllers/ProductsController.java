package ru.springapp.controllers;

import org.springframework.ui.Model;
import ru.springapp.entities.Category;
import ru.springapp.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.springapp.service.CategoryService;
import ru.springapp.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    private ProductService productService;
    private CategoryService categoryService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
    @Autowired
    public void setCategoryService(CategoryService categoryService) {this.categoryService = categoryService;}

    @RequestMapping(value = "/allproducts", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product getProductById(Model model, @PathVariable("id") int id) {
        return productService.getProductById(id);
    }

    @RequestMapping(value = "/allcategories", method = RequestMethod.GET)
    @ResponseBody
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Category getCategoryById(Model model, @PathVariable("id") int id) {
        return categoryService.getCategoryById(id);
    }
    @RequestMapping(value = "/product/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void getDeleteById(Model model, @PathVariable("id") int id) {
        productService.deleteProductById(id);
    }


}
