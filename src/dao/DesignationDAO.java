/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Designation;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 *
 * @author HP
 */
public interface DesignationDAO extends DAO<Designation>{
    Designation byName(String name) throws DatabaseException;
}
