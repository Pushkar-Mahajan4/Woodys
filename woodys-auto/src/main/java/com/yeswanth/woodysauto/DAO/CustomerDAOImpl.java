package com.yeswanth.woodysauto.DAO;

import com.yeswanth.woodysauto.Entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class CustomerDAOImpl implements CustomerDAO{

    private EntityManager entityManager;

    @Autowired
    public CustomerDAOImpl(EntityManager theEntityManager) { entityManager = theEntityManager; }

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> theQuery = entityManager.createQuery("FROM Customer", Customer.class);
        List<Customer> customers =theQuery.getResultList();
        return customers;
    }

    @Override
    @Transactional
    public Customer save(Customer customer) {
        System.out.println("THIS IS INSIDE IMPL" + customer);
        entityManager.merge(customer);
        return customer;
    }

    @Override
    public Customer findByID(int ID) {
        return null;
    }
}
