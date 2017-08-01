/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.StudentDAO;
import dao.impl.StudentDAOImpl;
import entity.School;
import entity.Student;
import java.util.List;
import org.eclipse.persistence.exceptions.DatabaseException;

/**
 *
 * @author HP
 */
public class StudentController {
    private static StudentDAO studentDAO = new StudentDAOImpl();
    
    public static void addStudent(Student student)throws DatabaseException{
        studentDAO.insert(student);
        
    }
    
    public static void removeStudent(Student s)throws DatabaseException{
        studentDAO.delete(s.getRank());
    }
    
    public static void editStudent(Student student)throws DatabaseException{
        studentDAO.update(student);
    }
    
    public static List<Student> getAllStudent()throws DatabaseException{
        return studentDAO.viewAll();
    }

    public static List<Student> searchStudentBySchool(School school) {
        return studentDAO.getBySchool(school);
    }
    public static List<Student> searchStudentByShy(int shy) {
        return studentDAO.getByShy(shy);
    }
    
    public static List<Student> searchStudentByRank(int rank) {
        return studentDAO.getByRank(rank);
    }
    public static List<Student> searchStudentByParent(boolean isLive, boolean isNJob) {
        return studentDAO.getByParent(isLive, isNJob);
    }
    
}
