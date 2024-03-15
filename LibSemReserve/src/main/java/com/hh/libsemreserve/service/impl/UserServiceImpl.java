package com.hh.libsemreserve.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hh.libsemreserve.entity.User;
import com.hh.libsemreserve.mapper.UserMapper;
import com.hh.libsemreserve.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int getIdByNumAndPassword(String num, String password) {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("num",num).eq("password",password));
        if(user == null){
            return 0;
        }
        return user.getId();
    }

    @Override
    public String getNameById(int id) {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("id",id));
        return user.getName();
    }

    @Override
    public String getNumById(int id) {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("id",id));
        return user.getNum();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.selectOne(new QueryWrapper<User>().eq("id",id));
    }


//    @Override
//    public int insertUser(User user) {
////        userMapper.selectOne(new QueryWrapper<User>().eq( ));
//        userMapper.insert(user);
//        return 1;
//    }

}
