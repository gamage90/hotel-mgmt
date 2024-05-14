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

                RoomsEntity roomsEntity = roomsDao.get(reservationsDto.getRoomID().toString());
                // String roomAvailableCheck = roomsEntity.getRoomAvailability().toString();
                Integer roomAvailableCheck = roomsEntity.getRoomAvailability();
                boolean isReservationUpdated = true;
                if (roomsEntity != null && roomAvailableCheck == 1) {
                    roomsEntity.setRoomAvailability(0);
                    if (!roomsDao.update(roomsEntity)) {
                        isReservationUpdated = false;
                    }
                    if (isReservationUpdated) {
                        connection.commit();
                        return "Successfully created reservation";
                    } else {
                        connection.rollback();
                        return "Error Updating Reservation";
                    }
                } else {
                    connection.rollback();
                    return "Room Update error. Please check room avaialability";
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

        Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);
            ReservationsEntity entity = reservationsDao.get(reservationsID);
            Integer roomID = entity.getRoomID();
            RoomsEntity roomsEntity = roomsDao.get(roomID.toString());

            if (reservationsDao.delete(reservationsID)) {
                Integer roomAvailableCheck = roomsEntity.getRoomAvailability();
                boolean isReservationDeleted = true;                
                
                if (roomsEntity != null && roomAvailableCheck == 0) {
                    roomsEntity.setRoomAvailability(1);
                    if (!roomsDao.update(roomsEntity)) {
                        isReservationDeleted = false;
                    }
                    if (isReservationDeleted) {
                        connection.commit();
                        return "Successfully deleted reservation";
                    } else {
                        connection.rollback();
                        return "Error Deleting Reservation";
                    }
                } else {
                    connection.rollback();
                    return "Reservation Delete error";
                }                              
                
            } else {
                return "Failed to delete reservation -> " + reservationsID;
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
