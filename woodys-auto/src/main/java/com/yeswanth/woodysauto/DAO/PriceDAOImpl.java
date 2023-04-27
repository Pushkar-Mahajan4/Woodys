package com.yeswanth.woodysauto.DAO;

import com.yeswanth.woodysauto.Entity.Customer;
import com.yeswanth.woodysauto.Entity.Price;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PriceDAOImpl implements PriceDAO{
    private EntityManager entityManager;

    public PriceDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Price> getAll() {
        TypedQuery<Price> theQuery = entityManager.createQuery("FROM Price", Price.class);
        List<Price> customers =theQuery.getResultList();
        return customers;
    }

    @Override
    public List<Price> save(Price price) {
        entityManager.merge(price);
        TypedQuery<Price> theQuery = entityManager.createQuery("FROM Price", Price.class);
        List<Price> customers =theQuery.getResultList();
        return customers;
    }

    @Override
    public Price getPrice(int ID) {
        return null;
    }
}
