package org.jasmine.ecommerce.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sales_id")
    private int sales_id;

    @Column(name="customer_id")
    private int customer_id;

    @Column(name="sales_date_time")
    private Timestamp sales_date_time;

    @Column(name = "recepient_addeess")
    private String recepient_addeess;

    @Column(name = "recepient_phone")
    private String recepient_phone;

    @Column(name = "recepient_remark")
    private String recepient_remark;


    @Column(name = "is_showed")
    private boolean is_showed;

    public Sales(int customer_id, Timestamp sales_date_time, String recepient_addeess, String recepient_phone, String recepient_remark, boolean is_showed) {
        this.customer_id = customer_id;
        this.sales_date_time = sales_date_time;
        this.recepient_addeess = recepient_addeess;
        this.recepient_phone = recepient_phone;
        this.recepient_remark = recepient_remark;
        this.is_showed = is_showed;
    }

    public Sales() {

    }

    public int getSales_id() {
        return sales_id;
    }

    public void setSales_id(int sales_id) {
        this.sales_id = sales_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Timestamp getSales_date_time() {
        return sales_date_time;
    }

    public void setSales_date_time(Timestamp sales_date_time) {
        this.sales_date_time = sales_date_time;
    }

    public String getRecepient_addeess() {
        return recepient_addeess;
    }

    public void setRecepient_addeess(String recepient_addeess) {
        this.recepient_addeess = recepient_addeess;
    }

    public String getRecepient_phone() {
        return recepient_phone;
    }

    public void setRecepient_phone(String recepient_phone) {
        this.recepient_phone = recepient_phone;
    }

    public String getRecepient_remark() {
        return recepient_remark;
    }

    public void setRecepient_remark(String recepient_remark) {
        this.recepient_remark = recepient_remark;
    }

    public boolean isIs_showed() {
        return is_showed;
    }

    public void setIs_showed(boolean is_showed) {
        this.is_showed = is_showed;
    }


    @Override
    public String toString() {
        return "Sales{" +
                "sales_id=" + sales_id +
                ", customer_id=" + customer_id +
                ", sales_date_time=" + sales_date_time +
                ", recepient_addeess='" + recepient_addeess + '\'' +
                ", recepient_phone='" + recepient_phone + '\'' +
                ", recepient_remark='" + recepient_remark + '\'' +
                ", is_showed=" + is_showed +
                '}';
    }
}
