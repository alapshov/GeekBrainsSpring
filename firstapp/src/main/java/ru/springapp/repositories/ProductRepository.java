package ru.springapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.springapp.entities.Product;

import java.util.List;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findAll();
    Product findById(int id);

//    private List<Product> productList;
//
//    public ProductRepository(){
//        Session session = SessionCreator.getSession();
//        session.beginTransaction();
//        productList = session.createQuery("from Product").getResultList();
//    }
//
//    public List<Product> getProductList(){
//        return productList;
//    }
//
//    public Product getProductById(int id){
//        for (Product product: productList) {
//            if(product.getId() == id) {
//                return product;
//            }
//        }
//        return null;
//    }
}
