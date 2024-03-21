package com.hh.libsemreserve.service;

import com.hh.libsemreserve.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 黄华
 * @since 2024-02-06 12:00:00
 */
public interface UserService extends IService<User> {
//    int insertUser(User user);
     int getIdByNumAndPassword(String num,String password);
     //返回用户id
     String getNameById(int id);


     String getNumById(int id);

     User getUserById(int id);

     int updateUser(User user);
}
