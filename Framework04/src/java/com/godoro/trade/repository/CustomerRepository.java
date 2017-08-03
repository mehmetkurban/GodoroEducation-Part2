

package com.godoro.trade.repository;

import com.godoro.trade.entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class CustomerRepository {
    
   private EntityManager entityManager;

    public CustomerRepository() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Framework03PU");
        entityManager = factory.createEntityManager();
        
    }
    
    public void close() {
        entityManager.close();
    }
   
    
    public void persist(Customer customer) {
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
    }
    
    public void merge(Customer customer) {
        entityManager.getTransaction().begin();
        entityManager.merge(customer);
        entityManager.getTransaction().commit();
    }
    
    public List<Customer> list() {
        String jpql = "Select customer from Customer as customer";
        Query query = entityManager.createQuery(jpql);
        return query.getResultList();
    }

    public Customer find(long customerId) {
       return entityManager.find(Customer.class, customerId);
    }
   

}
