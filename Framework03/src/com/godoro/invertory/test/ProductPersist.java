
package com.godoro.invertory.test;

import com.godoro.invertory.entity.Product;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ProductPersist {
    public static void main (String[] Args){
     Product product=new Product();
     product.setProductName("Cep Telefonu");
     product.setProductPrice(1200);
   
        EntityManagerFactory factory=Persistence
                .createEntityManagerFactory("Framework03PU");
        EntityManager entityManager=factory.createEntityManager();
    entityManager.getTransaction().begin();
    entityManager.persist(product);
    entityManager.getTransaction().commit();
    
    entityManager.close();
    
        System.out.println("Elendi"+product.getProductId());
    }
}
