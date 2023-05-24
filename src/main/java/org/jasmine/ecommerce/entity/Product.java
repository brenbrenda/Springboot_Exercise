package org.jasmine.ecommerce.entity;


import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getDetails_page() {
        return details_page;
    }

    public void setDetails_page(String details_page) {
        this.details_page = details_page;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="shop_id")
    private int shop_id;

    @Column(name="product_name")
    private String product_name;

    @Column(name="price")
    private String price;

    @Column(name = "discount")
    private String discount;

    @Column(name = "size")
    private String size;

//    @Column(name = "category")
//    private String category;

    @Column(name = "color")
    private String color;

    @Column(name = "inventory")
    private String inventory;


    @Column(name = "product_image")
    private String product_image;

    @Column(name = "details_page")
    private String details_page;

//    @ManyToOne
//    @JoinColumn(name = "shop", nullable = true)
//    private Shop shop;
}
