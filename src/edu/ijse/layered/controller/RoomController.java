/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.RoomsDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.RoomsService;
import java.util.List;

/**
 *
 * @author Home
 */
public class RoomController {
    
    private RoomsService roomsService = (RoomsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOMS);
    
    public String saveRoom(RoomsDto roomsDto) throws Exception{
        return roomsService.addRoom(roomsDto);
    }
    
    public String updateRoom(RoomsDto roomsDto) throws Exception{
        return roomsService.updateRoom(roomsDto);
    }
    
    public String deleteRoom(String id) throws Exception{
        return roomsService.deleteRoom(id);
    }
    
    public RoomsDto getRoom(String id) throws Exception{
        return roomsService.getRoom(id);
    }
    
    public List<RoomsDto> getAllRooms() throws Exception{
        return roomsService.getALL();
    }
    
}
