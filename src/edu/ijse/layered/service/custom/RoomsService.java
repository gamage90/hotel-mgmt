/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.RoomsDto;
import edu.ijse.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Home
 */
public interface RoomsService extends SuperService {
    String addRoom(RoomsDto roomsDto) throws Exception;
    String updateRoom(RoomsDto roomsDto) throws Exception;
    String deleteRoom(String roomID) throws Exception;
    RoomsDto getRoom(String roomID) throws Exception;
    List<RoomsDto> getALL() throws Exception; 
}
