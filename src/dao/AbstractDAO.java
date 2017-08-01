/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 *
 * @author HP
 */
public  class AbstractDAO<T> implements DAO<T> {
    
    private final static EntityManagerFactory emf;

    private Class<T> classE;

    static {

        emf = Persistence.createEntityManagerFactory("JunnoPU");
    }
    
    
    private EntityManager em;
    
     public AbstractDAO(Class classE)  {
        this.classE = classE;
     
    }
     protected EntityManager getEntityManager(){

        if (em == null) {
            em = emf.createEntityManager();
        }

        return em;
    }

    @Override
    public void insert(T entity) throws DatabaseException{
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(entity);
        getEntityManager().getTransaction().commit();
    }

    @Override
    public void update(T entity)throws DatabaseException {
        getEntityManager().getTransaction().begin();
        getEntityManager().merge(entity);
        getEntityManager().getTransaction().commit();
    }

    @Override
    public void delete(int id) throws DatabaseException {
        getEntityManager().detach(em.find(classE, id));
    }

    @Override
    public T search(int id) throws DatabaseException {
        return getEntityManager().find(classE, id);
    }

    @Override
    public List<T> viewAll()throws DatabaseException {
        Query q = getEntityManager().createNamedQuery(classE.getSimpleName() + ".findAll");
        return q.getResultList();
    }

}
