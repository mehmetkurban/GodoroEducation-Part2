
package com.godoro.invertory.test;

import com.godoro.invertory.entity.Product;
import static com.godoro.invertory.entity.Product_.productId;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductMerge {
    public static void main(String[] args) {
        long productId=1;
    
    EntityManagerFactory factory=Persistence
                .createEntityManagerFactory("Framework03PU");
        EntityManager entityManager=factory.createEntityManager();
        
        Product product=entityManager.find(Product.class,productId);
        product.setProductName("Masaüstü Bilgisayar");
        product.setProductPrice(2150);
    
        entityManager.getTransaction().begin();
        entityManager.merge(product);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        
    }     
}
