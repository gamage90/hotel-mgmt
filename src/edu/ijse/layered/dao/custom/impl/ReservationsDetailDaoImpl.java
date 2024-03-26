/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.ReservationsDetailDao;
import edu.ijse.layered.entity.ReservationsDetailEntity;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class ReservationsDetailDaoImpl implements ReservationsDetailDao {

    @Override
    public boolean add(ReservationsDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO reservationsdetails VALUES(?,?,?,?,?,?)", 
                t.getResId(),
                t.getRoomId(),
                t.getCheckinDate(),
                t.getCheckoutDate(),
                t.getPackageName(),
                t.getAmount());

    }

    @Override
    public boolean update(ReservationsDetailEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public ReservationsDetailEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ReservationsDetailEntity> getAll() throws Exception {
        return null;
    }

}
