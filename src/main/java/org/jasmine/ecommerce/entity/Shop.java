package org.jasmine.ecommerce.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private int shop_id;

    @Column(name = "shop_name")
    private String shop_name;

    @ManyToOne
    @JoinColumn(name = "merchant_id", nullable = false)
    private Merchants merchant;

//    @OneToMany(mappedBy = "shop")
//    private List<Product> products;


}



