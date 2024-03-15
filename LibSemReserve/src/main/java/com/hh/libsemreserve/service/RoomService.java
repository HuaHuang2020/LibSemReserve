package com.hh.libsemreserve.service;

import com.hh.libsemreserve.entity.Room;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 黄华
 * @since 2024-02-06 12:00:00
 */
public interface RoomService extends IService<Room> {
    int insertRoom(Room room);

    int updateRoom(Room room);

    int deleteRoom(Room room);
}
