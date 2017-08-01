/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AbstractDAO;
import dao.StudentDAO;
import entity.School;
import entity.Student;
import java.util.List;
import javax.persistence.Query;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 *
 * @author HP
 */
public class StudentDAOImpl extends AbstractDAO<Student> implements StudentDAO {

    public StudentDAOImpl() {
        super(Student.class);
    }

    @Override
    public List<Student> getBySchool(School s) throws DatabaseException {
        Query q = getEntityManager().createNamedQuery("Student.findBySchool");
        return q.setParameter("id", s).getResultList();

    }

    @Override
    public List<Student> getByShy(int shy) throws DatabaseException {
        Query q = getEntityManager().createNamedQuery("Student.findByShy");
        return q.setParameter("shy", shy).getResultList();
    }

    @Override
    public List<Student> getByRank(int rank) throws DatabaseException {
        Query q = getEntityManager().createNamedQuery("Student.findByRank");
        return q.setParameter("rank", rank).getResultList();
    }

    @Override
    public List<Student> getByParent(boolean isLive, boolean isNJob) throws DatabaseException {
        String sql = "select distinct s.* from Student s,Parent p ";
        if (isLive) {
            sql += "where s.rank = p.student_rank ";
            if (isNJob) {
                sql += "and p.designation_id = (select d1.id from Designation d1 where name = 'No Job')";
            } 
        } else {
            sql += " where s.rank not in (select p1.student_rank from Parent p1 where p1.f_m = 'Mother') or s.rank not in (select p1.student_rank from Parent p1 where p1.f_m = 'Father') ";
        }
        System.out.println(sql);
        Query q = getEntityManager().createNativeQuery(sql, Student.class);        

        return q.getResultList();

    }

}
