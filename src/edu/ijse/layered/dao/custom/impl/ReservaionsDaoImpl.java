/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.ReservaionsDao;
import edu.ijse.layered.entity.ReservationsEntity;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class ReservaionsDaoImpl implements ReservaionsDao {

    @Override
    public boolean add(ReservationsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO reservations VALUES(?,?,?)", t.getResId(),
                t.getCustId(),t.getDate());
    }

    @Override
    public boolean update(ReservationsEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public ReservationsEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ReservationsEntity> getAll() throws Exception {
        return null;
    }

}
