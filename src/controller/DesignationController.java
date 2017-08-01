/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DesignationDAO;
import dao.impl.DesignationDAOImpl;
import entity.Designation;
import java.util.List;

/**
 *
 * @author HP
 */
public class DesignationController {
    private static DesignationDAO designationDAO = new DesignationDAOImpl();
    
    public static List<Designation> getAllDesignations(){
        return designationDAO.viewAll();
    }
    
    public static Designation getDesignationByName(String name){
        return designationDAO.byName(name);
    }
    public static void newDesignation(Designation designation){
        designationDAO.insert(designation);
    }
    
}
