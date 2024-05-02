/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.ReservationsDao;
import edu.ijse.layered.dao.custom.RoomsDao;
import edu.ijse.layered.db.DBConnection;
import edu.ijse.layered.dto.ReservationsDto;
import edu.ijse.layered.entity.ReservationsEntity;
import edu.ijse.layered.entity.RoomsEntity;
import edu.ijse.layered.service.custom.ReservationsService;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class ReservationsServiceImpl implements ReservationsService {

    private ReservationsDao reservationsDao = (ReservationsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RESERVATIONS);
    private RoomsDao roomsDao = (RoomsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOMS);

    @Override
//    public String addReservations(ReservationsDto reservationsDto) throws Exception {
//        ReservationsEntity reservationsEntity = new ReservationsEntity(reservationsDto.getReservationsID(),
//                reservationsDto.getCustomerID(),
//                reservationsDto.getRoomID(),
//                reservationsDto.getReservationsDate(),
//                reservationsDto.getCheckInDate(),
//                reservationsDto.getCheckOutDate(),
//                reservationsDto.getResPackage(),
//                reservationsDto.getResAmount());
//        if (reservationsDao.add(reservationsEntity)) {
//            return "Successfully Saved";
//        } else {
//            return "Fail";
//        }
//    }
    public String addReservations(ReservationsDto reservationsDto) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);

            ReservationsEntity reservationsEntity = new ReservationsEntity(reservationsDto.getReservationsID(),
                    reservationsDto.getCustomerID(),
                    reservationsDto.getRoomID(),
                    reservationsDto.getReservationsDate(),
                    reservationsDto.getCheckInDate(),
                    reservationsDto.getCheckOutDate(),
                    reservationsDto.getResPackage(),
                    reservationsDto.getResAmount());

            if (reservationsDao.add(reservationsEntity)) {
                //return "Successfully Saved";

                boolean isReservationSaved = true;
                //if (!reservationsDao.add(reservationsEntity)) {
                //     isReservationSaved = false;
                // }

                if (isReservationSaved) {
                    boolean isReservationUpdated = true;

                    RoomsEntity roomsEntity = roomsDao.get(reservationsDto.getRoomID().toString());
                    String roomAvailableCheck = roomsEntity.getRoomAvailability().toString();
                    if (roomsEntity != null) {                                             
                        roomsEntity.setRoomAvailability(0);
                        if (!roomsDao.update(roomsEntity)) {
                            isReservationUpdated = false;
                        }
                    }
                    if (isReservationUpdated) {
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Error Updating Reservation";
                    }

                } else {
                    connection.rollback();
                    return "Error Creating Reservation";
                }

            } else {
                connection.rollback();
                return "Error Creating Reservation";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }

    }

    @Override
    public String updateReservations(ReservationsDto reservationsDto) throws Exception {
        ReservationsEntity reservationsEntity = new ReservationsEntity(reservationsDto.getReservationsID(),
                reservationsDto.getCustomerID(),
                reservationsDto.getRoomID(),
                reservationsDto.getReservationsDate(),
                reservationsDto.getCheckInDate(),
                reservationsDto.getCheckOutDate(),
                reservationsDto.getResPackage(),
                reservationsDto.getResAmount());
        if (reservationsDao.update(reservationsEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }

    }

    @Override
    public String deleteReservations(String reservationsID) throws Exception {
        if (reservationsDao.delete(reservationsID)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }

    }

    @Override
    public ReservationsDto getReservations(String reservationsID) throws Exception {
        ReservationsEntity entity = reservationsDao.get(reservationsID);
        if (entity != null) {
            return new ReservationsDto(entity.getReservationsID(),
                    entity.getCustomerID(),
                    entity.getRoomID(),
                    entity.getReservationsDate(),
                    entity.getCheckInDate(),
                    entity.getCheckOutDate(),
                    entity.getResPackage(),
                    entity.getResAmount());
        }
        return null;
    }

    @Override
    public List<ReservationsDto> getALL() throws Exception {
        List<ReservationsDto> reservationsDtos = new ArrayList<>();
        List<ReservationsEntity> reservationsEntities = reservationsDao.getAll();
        for (ReservationsEntity entity : reservationsEntities) {
            reservationsDtos.add(new ReservationsDto(entity.getReservationsID(),
                    entity.getCustomerID(),
                    entity.getRoomID(),
                    entity.getReservationsDate(),
                    entity.getCheckInDate(),
                    entity.getCheckOutDate(),
                    entity.getResPackage(),
                    entity.getResAmount()));
        }
        return reservationsDtos;

    }

}
