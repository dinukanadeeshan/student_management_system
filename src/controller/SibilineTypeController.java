/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SibilineTypeDAO;
import dao.impl.SibilineTypeDAOImpl;
import entity.Sibilinetype;
import java.util.List;

/**
 *
 * @author HP
 */
public class SibilineTypeController {
    private static SibilineTypeDAO  sibilineTypeDAO = new SibilineTypeDAOImpl();
    
    public static List<Sibilinetype> getAllSibilinetypes(){
        return sibilineTypeDAO.viewAll();
    }
    
}
