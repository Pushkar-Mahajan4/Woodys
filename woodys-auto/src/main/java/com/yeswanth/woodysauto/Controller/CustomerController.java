package com.yeswanth.woodysauto.Controller;

import com.yeswanth.woodysauto.DAO.CustomerDAO;
import com.yeswanth.woodysauto.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerDAO customerDAO;

    @Autowired
    public CustomerController(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer addCustomer){
        System.out.println("RESTCONTROLLER: " +addCustomer);
        Customer newCustomer = customerDAO.save(addCustomer);
        return newCustomer;
    }

    @GetMapping("/")
    public String getHello(){
        return ("Hello world");
    }

}
