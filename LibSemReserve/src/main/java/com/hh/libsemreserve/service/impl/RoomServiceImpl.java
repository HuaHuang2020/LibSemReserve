package com.hh.libsemreserve.service.impl;

import com.hh.libsemreserve.entity.Room;
import com.hh.libsemreserve.mapper.RoomMapper;
import com.hh.libsemreserve.service.RoomService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黄华
 * @since 2024-02-06 12:00:00
 */
@Service
public class RoomServiceImpl extends ServiceImpl<RoomMapper, Room> implements RoomService {
    @Autowired
    private RoomMapper roomMapper;

    public int insertRoom(Room room){
        return roomMapper.insert(room);
    }

    public int updateRoom(Room room){
        roomMapper.deleteById(room);
        return roomMapper.insert(room);
    }

    public int deleteRoom(int id){
        return roomMapper.deleteById( roomMapper.selectById(id) );
    }

    @Override
    public Room selectById(int id) {
        return roomMapper.selectById(id);
    }
}
