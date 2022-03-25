package ru.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.springapp.entities.Cart;
import ru.springapp.repositories.CartRepository;

import java.util.List;

@Service
public class CartService {
    private CartRepository cartRepository;

    @Autowired
    private void setCartRepository(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }

    public List<Cart> getAllCart(){
        return cartRepository.findAll();
    }

    public Cart getCartById(int id) {
        return cartRepository.findById(id);
    }

    public Cart addProductToCart(Cart cart) {
        int countProductInCart = 1;
        cart.setCount(countProductInCart);
        if (cartRepository.findByProductId(cart.productId) != null) {
            cartRepository.save(cart);
        } else {
            countProductInCart++;
            cart.setCount(countProductInCart);
            cartRepository.save(cart);
        }

        return cart;
    }

    public void deleteProductById(int id) {
        cartRepository.deleteById(id);
    }

}
