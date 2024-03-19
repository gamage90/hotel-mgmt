/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.RoomsDao;
import edu.ijse.layered.entity.RoomsEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class RoomsDaoImpl implements RoomsDao{

    @Override
    public boolean add(RoomsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO ROOMS VALUES(?,?,?,?,?)",
                t.getRoomID(),
                t.getRoomCatagory(),
                t.getRoomNumber(),
                t.getRoomAvailability(),
                t.getRoomRate());

    }

    @Override
    public boolean update(RoomsEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE ROOMS SET category_id=?, room_number=?, availability=?, rate=? WHERE room_id=?",
                t.getRoomCatagory(),
                t.getRoomNumber(),
                t.getRoomAvailability(),
                t.getRoomRate(),
                t.getRoomID());

    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM ROOMS WHERE room_id=?", id);
    }

    @Override
    public RoomsEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM ROOMS WHERE room_id=?", id);
        while (rst.next()) {
            return new RoomsEntity(rst.getInt("room_id"), 
                    rst.getInt("category_id"), 
                    rst.getString("room_number"), 
                    rst.getInt("availability"), 
                    rst.getDouble("rate"));
        }
        return null;

    }

    @Override
    public ArrayList<RoomsEntity> getAll() throws Exception {
        ArrayList<RoomsEntity> roomsEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM rooms");
        
         while (rst.next()) {
             roomsEntities.add(new RoomsEntity(rst.getInt("room_id"), 
                    rst.getInt("category_id"), 
                    rst.getString("room_number"), 
                    rst.getInt("availability"), 
                    rst.getDouble("rate")));        
         }  
         return roomsEntities;
    }    
}
