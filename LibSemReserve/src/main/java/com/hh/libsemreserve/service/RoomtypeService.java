package com.hh.libsemreserve.service;

import com.hh.libsemreserve.entity.Roomtype;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 黄华
 * @since 2024-02-06 12:00:00
 */
public interface RoomtypeService extends IService<Roomtype> {
    int addType(String name, String capacity, String reserveDetails);
}

