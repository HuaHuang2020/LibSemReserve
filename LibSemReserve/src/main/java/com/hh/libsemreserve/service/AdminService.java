package com.hh.libsemreserve.service;

import com.hh.libsemreserve.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 黄华
 * @since 2024-02-06 12:00:00
 */
public interface AdminService extends IService<Admin> {

    int getIdByNumAndPassword(String name, String password);
}
