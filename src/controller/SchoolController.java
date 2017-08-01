/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SchoolDAO;
import dao.impl.SchoolDAOImpl;
import entity.School;
import java.util.List;

/**
 *
 * @author HP
 */
public class SchoolController {
    private static SchoolDAO schoolDAO = new SchoolDAOImpl();
    
    public static List<School> getAllSchools(){
        return schoolDAO.viewAll();
    }
    
    public static void addNewSchool(School school){
        schoolDAO.insert(school);
    }
    
    public static School findForName(String name){
        return schoolDAO.byName(name);
    }
    
}
