package ru.springapp.entities;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
//    private List<Product> productList;

    public Category() {
    }

    public Category(int id, String title, String description, List<Product> productList) {
        this.id = id;
        this.title = title;
        this.description = description;
        //this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //public List<Product> getProductList() {
      //  return productList;
    //}

//    public void setProductList(List<Product> productList) {
//        this.productList = productList;
//    }
}
