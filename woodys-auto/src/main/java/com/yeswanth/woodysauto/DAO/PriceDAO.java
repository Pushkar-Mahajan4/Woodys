package com.yeswanth.woodysauto.DAO;

import com.yeswanth.woodysauto.Entity.Price;

import java.util.List;

public interface PriceDAO {

    List<Price> getAll();
    List<Price> save(Price price);

    Price getPrice(int ID);

}
