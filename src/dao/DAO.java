/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 *
 * @author HP
 */
public interface DAO<E>{
    void insert(E entity)throws DatabaseException;
    void update(E entity)throws DatabaseException;
    void delete(int id)throws DatabaseException;
    E search(int id)throws DatabaseException;
    List<E> viewAll()throws DatabaseException;
    
}
