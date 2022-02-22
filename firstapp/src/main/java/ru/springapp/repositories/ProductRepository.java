package ru.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.springapp.entities.Product;

import java.util.List;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findAll();
    Product findById(int id);
    Product deleteById(int id);
}
