package ru.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.springapp.entities.Cart;
import ru.springapp.service.CartService;

@RestController@Controller
@RequestMapping("/admin")
public class CartController {
    private CartService cartService;

    @Autowired
    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/addProductToCart")
    private Cart addProductToCart(@RequestBody Cart cart) {
        cart = cartService.addProductToCart(cart);
        return cart;
    }

    @DeleteMapping("/products/{id}")
    private int deleteProductFromCart(@PathVariable Integer id) {
        cartService.deleteProductById(id);
        return HttpStatus.OK.value();
    }

}
