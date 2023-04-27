package com.yeswanth.woodysauto.Controller;

import com.yeswanth.woodysauto.DAO.CustomerDAO;
import com.yeswanth.woodysauto.DAO.PriceDAO;
import com.yeswanth.woodysauto.Entity.Customer;
import com.yeswanth.woodysauto.Entity.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerDAO customerDAO;
    private PriceDAO priceDAO;

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

    @PostMapping("/update/price")
    public List<Price> updatePrice(@RequestBody Price price){
        System.out.println(price.toString());
//        System.out.println(new_price + "Hello");
//        double doublePrice = Double.parseDouble(new_price);
//        List<Price> result = priceDAO.getAll();
//        Price search = null;
//        for(Price prices: result){
//            if(prices.getService().equals(service)){
//                search = prices;
//            }
//        }
//
////        search.setPrice(doublePrice);
//        List<Price> updated = priceDAO.save(search);
//
//        return updated;
        return null;
    }

    @GetMapping("/")
    public String getHello(){
        return ("Hello world");
    }

}
