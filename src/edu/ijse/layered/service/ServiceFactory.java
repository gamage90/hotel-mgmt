/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service;

import edu.ijse.layered.service.custom.impl.CategoryServiceImpl;
import edu.ijse.layered.service.custom.impl.CustomerServiceImpl;
import edu.ijse.layered.service.custom.impl.ReservationsServiceImpl;
import edu.ijse.layered.service.custom.impl.RoomServiceImpl;

/**
 *
 * @author Home
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){

        switch (serviceType) {
            case ROOMCATEGORIES:
                return new CategoryServiceImpl();
            case CUSTOMERS:
                return new CustomerServiceImpl();
            case ROOMS:
                return new RoomServiceImpl();
            case RESERVATION:
                return new ReservationsServiceImpl();
            default:
                return null;
        }

    }

    public enum ServiceType{
        ROOMCATEGORIES, CUSTOMERS, ROOMS, RESERVATION
    }
    
}
