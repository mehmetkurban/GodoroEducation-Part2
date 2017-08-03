package com.godoro.libray.database;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class PersistenceUtilities {
    private static EntityManagerFactory factory;
    
    public static EntityManagerFactory getFactory(){
        if(factory==null){
            factory=Persistence
                    .createEntityManagerFactory("Framework09TekrarPU");
        }
        return factory;
    }
}
