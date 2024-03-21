package com.hh.libsemreserve.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hh.libsemreserve.entity.Admin;
import com.hh.libsemreserve.mapper.AdminMapper;
import com.hh.libsemreserve.service.AdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int getIdByNumAndPassword(String name, String password) {
        Admin admin = adminMapper.selectOne(new QueryWrapper<Admin>()
                .eq("name",name).eq("password",password));
        if(admin == null){
            return 0;
        }
        return 1;
    }
}
