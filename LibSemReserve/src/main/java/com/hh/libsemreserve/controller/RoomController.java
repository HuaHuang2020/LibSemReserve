package com.hh.libsemreserve.controller;

import com.hh.libsemreserve.entity.Room;
import com.hh.libsemreserve.service.RoomService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@CrossOrigin(origins = "http://localhost:8081/",allowCredentials = "true")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping(value = "/new")
    public int addRoom(
            String num,
            String pic,
            String type
    ) {
        Room room = new Room();
        room.setNum(num);
        room.setPicture(pic);
        room.setType(type);
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





}
