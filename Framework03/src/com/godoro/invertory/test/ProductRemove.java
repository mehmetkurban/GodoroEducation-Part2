
package com.godoro.invertory.test;

import com.godoro.invertory.entity.Product;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductRemove {
    public static void main(String[] args) {
        
    
    long productId=1;
    
        EntityManagerFactory factory=Persistence
                .createEntityManagerFactory("Framework03PU");
        EntityManager entityManager=factory.createEntityManager();
        
        Product product=entityManager.find(Product.class,productId);
        entityManager.getTransaction().begin();
        entityManager.remove(product);
        entityManager.getTransaction().commit();
        
        entityManager.close();
    }   
}
