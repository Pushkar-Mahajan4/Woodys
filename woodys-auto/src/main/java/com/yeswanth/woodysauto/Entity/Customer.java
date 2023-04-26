package com.yeswanth.woodysauto.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private int customer_id;

    @Column(name="password")
    private String password;

    public String getPassword() {
        return password;
    }

    @Column(name="address")
    private String address;
    @Column(name="email")
    private String email;
    @Column(name="name")
    private String name;
    @Column(name="phoneNumber")
    private String phoneNumber;

    Customer(String name, String password, String email, String address, String phoneNumber){
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public Customer() {

    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
