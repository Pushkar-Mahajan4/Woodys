package com.yeswanth.woodysauto.DAO;

import com.yeswanth.woodysauto.Entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> findAll();

    Customer save(Customer customer);

    Customer findByID(int ID);


}
