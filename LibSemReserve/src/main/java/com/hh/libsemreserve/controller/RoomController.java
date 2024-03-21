package com.hh.libsemreserve.controller;

import com.hh.libsemreserve.entity.Room;
import com.hh.libsemreserve.entity.Roomtype;
import com.hh.libsemreserve.service.RoomService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.hh.libsemreserve.constant.cons.Url;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 黄华
 * @since 2024-02-06 12:00:00
 */
@RestController
@RequestMapping("/room")
@CrossOrigin(origins = Url ,allowCredentials = "true")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping(value = "/new")
    public int addRoom(@RequestBody Room room){
        return roomService.insertRoom(room);
    }

    @PostMapping(value = "/update")
    public int updateRoom(
            String pic,
            String type
    ) {
        Room room = new Room();
        room.setPicture(pic);
        room.setType(type);
        return roomService.updateRoom(room);
    }

    @GetMapping(value = "/getAll")
    public List<Room> getAllRooms(){
        return roomService.list();
    }

    @DeleteMapping(value = "/delete")
    public int deleteRoom(int id){
        return roomService.deleteRoom(id);
    }





}
