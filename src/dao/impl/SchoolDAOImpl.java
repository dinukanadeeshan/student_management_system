/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AbstractDAO;
import dao.SchoolDAO;
import entity.School;
import javax.persistence.Query;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 *
 * @author HP
 */
public class SchoolDAOImpl extends AbstractDAO<School> implements SchoolDAO{

    public SchoolDAOImpl() {
        super(School.class);
    }

    @Override
    public School byName(String name) throws DatabaseException {
        return (School) getEntityManager().createNamedQuery("School.findByName").setParameter("name", name).getSingleResult();
        
    }
    
    
}
