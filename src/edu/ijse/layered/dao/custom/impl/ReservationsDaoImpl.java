/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.ReservationsDao;
import edu.ijse.layered.entity.ReservationsEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class ReservationsDaoImpl implements ReservationsDao {

    @Override
    public boolean add(ReservationsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO reservations VALUES(?,?,?,?,?,?,?,?)",
                t.getReservationsID(),
                t.getCustomerID(),
                t.getRoomID(),
                t.getReservationsDate(),
                t.getCheckInDate(),
                t.getCheckOutDate(),
                t.getResPackage(),
                t.getResAmount());
    }

    @Override
    public boolean update(ReservationsEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE reservations SET customer_id=? room_id=? "
                + "reservation_date=? check_in_date=? check_out_date=? package=? amount=? "
                + "WHERE reservation_id=?",
                t.getCustomerID(),
                t.getRoomID(),
                t.getReservationsDate(),
                t.getCheckInDate(),
                t.getCheckOutDate(),
                t.getResPackage(),
                t.getResAmount(),
                t.getReservationsID());

    }

    @Override
    public boolean delete(String id) throws Exception {
            return CrudUtil.executeUpdate("DELETE FROM reservations WHERE reservation_id=?", id);
    }

    @Override
    public ReservationsEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM reservations WHERE reservation_id=?", id);
        while (rst.next()) {
            return new ReservationsEntity(rst.getInt("reservation_id"), 
                    rst.getInt("customer_id"), 
                    rst.getInt("room_id"), 
                    rst.getString("reservation_date"), 
                    rst.getString("check_in_date"), 
                    rst.getString("check_out_date"), 
                    rst.getString("package"), 
                    rst.getDouble("amount"));
        }
        return null;

    }

    @Override
    public ArrayList<ReservationsEntity> getAll() throws Exception {
        ArrayList<ReservationsEntity> reservationsEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM reservations");
        
        while (rst.next()) {
             reservationsEntities.add(new ReservationsEntity(rst.getInt("reservation_id"), 
                    rst.getInt("customer_id"), 
                    rst.getInt("room_id"), 
                    rst.getString("reservation_date"), 
                    rst.getString("check_in_date"), 
                    rst.getString("check_out_date"), 
                    rst.getString("package"), 
                    rst.getDouble("amount")));        
         }  
         return reservationsEntities;

    }
    
}
