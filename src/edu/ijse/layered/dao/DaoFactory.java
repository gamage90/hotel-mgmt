/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;

import edu.ijse.layered.dao.custom.impl.CategoryDaoImpl;
import edu.ijse.layered.dao.custom.impl.CustomerDaoImpl;

/**
 *
 * @author Home
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
    
        switch (type) {
            case ROOMCATEGORIES:
                return new CategoryDaoImpl();
            case CUSTOMERS:
                return new CustomerDaoImpl();

            default:
                return null;
        }
    }
    
     public enum DaoTypes{
        ROOMCATEGORIES, CUSTOMERS
    }
}
