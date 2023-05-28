package org.jasmine.ecommerce.entity;


import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "total_price", nullable = false)
    private double totalPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status", nullable = false)
    private OrderStatus orderStatus;

    @Column(name = "buyer_notes")
    private String buyerNotes;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;


//    @Column(name = "order_time")
//    private Timestamp order_time;


    // Getters and setters
    // ...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getBuyerNotes() {
        return buyerNotes;
    }

    public void setBuyerNotes(String buyerNotes) {
        this.buyerNotes = buyerNotes;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    public Timestamp getOrder_time() {
//        return order_time;
//    }
//
//    public void setOrder_time(Timestamp order_time) {
//        this.order_time = order_time;
//    }

}


