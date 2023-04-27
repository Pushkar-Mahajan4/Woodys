package com.yeswanth.woodysauto.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="prices")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="price_id")
    private int price_id;

    @Column(name="service")
    private String service;

    @Column(name="price")
    private Double price;

    public Price(int price_id, String service, Double price) {
        this.price_id = price_id;
        this.service = service;
        this.price = price;
    }

    public Price() {

    }

    public int getPrice_id() {
        return price_id;
    }

    public void setPrice_id(int price_id) {
        this.price_id = price_id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price_id=" + price_id +
                ", service='" + service + '\'' +
                ", price=" + price +
                '}';
    }

}
