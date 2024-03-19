/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.RoomsDao;
import edu.ijse.layered.dto.RoomsDto;
import edu.ijse.layered.entity.RoomsEntity;
import edu.ijse.layered.service.custom.RoomsService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */

public class RoomServiceImpl implements RoomsService {

    private RoomsDao roomsDao = (RoomsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ROOMS);

    @Override
    public String addRoom(RoomsDto roomsDto) throws Exception {
        RoomsEntity roomEntity = new RoomsEntity(roomsDto.getRoomID(),
                roomsDto.getRoomCatagory(),
                roomsDto.getRoomNumber(),
                roomsDto.getRoomAvailability(),
                roomsDto.getRoomRate());
        if (roomsDao.add(roomEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateRoom(RoomsDto roomsDto) throws Exception {
        RoomsEntity roomEntity = new RoomsEntity(roomsDto.getRoomID(),
                roomsDto.getRoomCatagory(),
                roomsDto.getRoomNumber(),
                roomsDto.getRoomAvailability(),
                roomsDto.getRoomRate());
        if (roomsDao.update(roomEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }

    }

    @Override
    public String deleteRoom(String roomID) throws Exception {
        if (roomsDao.delete(roomID)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }

    }

    @Override
    public RoomsDto getRoom(String roomID) throws Exception {
        RoomsEntity entity = roomsDao.get(roomID);
    if (entity != null) {
        return new RoomsDto(entity.getRoomID(),
                    entity.getRoomCatagory(),
                    entity.getRoomNumber(), 
                    entity.getRoomAvailability(), 
                    entity.getRoomRate());
    }
    return null;
    }
    

    @Override
    public List<RoomsDto> getALL() throws Exception {
        List<RoomsDto> roomsDtos = new ArrayList<>();
        List<RoomsEntity> roomsEntities = roomsDao.getAll();
        for (RoomsEntity entity : roomsEntities) {
         roomsDtos.add(new RoomsDto(entity.getRoomID(), 
                 entity.getRoomCatagory(), 
                 entity.getRoomNumber(), 
                 entity.getRoomAvailability(), 
                 entity.getRoomRate()));
        }
         return roomsDtos;
    }   
}
