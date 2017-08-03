package com.godoro.libray.database;

import java.util.List;
import java.util.Locale;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

abstract public class BaseRepository<E extends BaseEntity>{
    private final static String SELECT="select %s from %s as %s";
    protected EntityManager entityManager;
    protected Class<E> entityClass;    
    
    public BaseRepository(Class<E> entityClass){
        this.entityClass=entityClass;
        entityManager =PersistenceUtilities.getFactory().createEntityManager();
    }
    public void close(){
        entityManager.close();
    }
    
    public void persist(E entity){
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }
    public void merge(E entity){
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        
    }
    public void remove(long id){
        E entity=entityManager.getReference(entityClass, id);
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }
    public E find(long id){
        return entityManager.find(entityClass, id);
    }
    
    protected String createSelectJpql(){
        String entityName=entityClass.getSimpleName();
        String variableName=entityName.toLowerCase(Locale.US);
        String jpql=String.format(SELECT,variableName,entityName,variableName);
        return jpql;
    }
    public List<E> list(){
         String jpql=createSelectJpql();
        Query query=entityManager.createQuery(jpql);
        return query.getResultList();
    }
    
}
