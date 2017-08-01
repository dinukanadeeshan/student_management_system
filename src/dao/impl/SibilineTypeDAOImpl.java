/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AbstractDAO;
import dao.SibilineTypeDAO;
import entity.Sibilinetype;

/**
 *
 * @author HP
 */
public class SibilineTypeDAOImpl extends AbstractDAO<Sibilinetype> implements SibilineTypeDAO{

    public SibilineTypeDAOImpl() {
        super(Sibilinetype.class);
    }
    
}
