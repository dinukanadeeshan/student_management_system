/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.School;
import entity.Student;
import java.util.List;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 *
 * @author HP
 */
public interface StudentDAO extends DAO<Student>{
    List<Student> getBySchool(School s) throws DatabaseException;
    List<Student> getByShy(int shy) throws DatabaseException;
    List<Student> getByRank(int rank) throws DatabaseException;
    List<Student>  getByParent(boolean isLive, boolean isNJob)throws DatabaseException;
}
