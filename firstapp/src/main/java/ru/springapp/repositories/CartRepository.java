package ru.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.springapp.entities.Cart;

import java.util.List;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
    List<Cart> findAll();
    Cart findById(int id);
    Cart findByProductId(int id);
    Cart deleteById(int id);
}
