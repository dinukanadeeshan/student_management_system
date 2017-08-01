/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AbstractDAO;
import dao.DesignationDAO;
import entity.Designation;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 *
 * @author HP
 */
public class DesignationDAOImpl extends AbstractDAO<Designation> implements DesignationDAO {

    public DesignationDAOImpl() {
        super(Designation.class);
    }

    @Override
    public Designation byName(String name) throws DatabaseException {
        return (Designation) getEntityManager().createNamedQuery("Designation.findByName").setParameter("name", name).getSingleResult();
    }
    
}
