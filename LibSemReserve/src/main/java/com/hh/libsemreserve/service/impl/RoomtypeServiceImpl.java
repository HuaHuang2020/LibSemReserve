package com.hh.libsemreserve.service.impl;

import com.hh.libsemreserve.entity.Roomtype;
import com.hh.libsemreserve.mapper.RoomtypeMapper;
import com.hh.libsemreserve.service.RoomtypeService;
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
public class RoomtypeServiceImpl extends ServiceImpl<RoomtypeMapper, Roomtype> implements RoomtypeService {
    @Autowired
    private RoomtypeMapper roomtypeMapper;

    @Override
    public int addType(String name, String capacity, String reserveDetails) {
        Roomtype type = new Roomtype();
        type.setName(name);
        type.setCapacity(capacity);
        type.setReserveDetails(reserveDetails);
        roomtypeMapper.insert(type);
        return 1;
    }


}
