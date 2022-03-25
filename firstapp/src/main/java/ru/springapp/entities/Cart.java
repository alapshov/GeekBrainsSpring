package ru.springapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;
    @Column(name = "product_id")
    public int productId;
    @Column(name = "user_id")
    public int userId;
    @Column(name = "count")
    private int count;
    @Column(name = "price")
    private int price;

    public Cart() {

    }

    public Cart(int id, int productId, int userId, int count) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
