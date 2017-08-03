
package com.godoro.invertory.test;

import com.godoro.invertory.entity.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductList {
    public static void main(String[] args) {
        double productPriceMin=1000;
        EntityManagerFactory factory=Persistence
                .createEntityManagerFactory("Framework03PU");
        EntityManager entityManager=factory.createEntityManager();
        
        String jpql="select product from Product as product "
                +" where product.productPrice >= :productPriceMin";
        Query query=entityManager.createQuery(jpql);
        query.setParameter("productPriceMin",productPriceMin);
        List<Product> productlist=query.getResultList();
        
        for(Product product:productlist){
            System.out.println(product.getProductId()+""
            +product.getProductName()+""
            +product.getProductPrice());
        }
        entityManager.close();
    }
}
