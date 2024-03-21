package com.hh.libsemreserve.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.hh.libsemreserve.entity.User;
import com.hh.libsemreserve.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static com.hh.libsemreserve.constant.cons.Url;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 黄华
 * @since 2024-02-06 12:00:00
 */
@Slf4j
@RestController
@RequestMapping("/user/")
@CrossOrigin(origins =  Url ,allowCredentials = "true")
public class UserController {

    @Autowired
    private UserService userService;

    //注册
//    @PostMapping("signup")
//    public String doSignUp(String name, String pwd) {
//        User user = new User(name, pwd);
//        if(userService.insertUser(user) == 1 ){
//            return "注册成功";
//        }else{
//            log.error(String.valueOf(userService.insertUser(user)));
//            return "注册失败";
//        }
//    }
    // 测试登录，浏览器访问： http://localhost:8081/user/doLogin?username=zhang&password=123456


//    @PostMapping("/doLogin")
//    public String doLogin( String num,  String password ) {//登录用学号，因为名字可能重复
//
//        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
////        if("hh".equals(num) && "525757".equals(password)) {
////            StpUtil.login(10001);//获取用户id吧
////            return "登录成功";
////        }
////        return "登录失败";
//        int userId = userService.getIdByNumAndPassword(num,password);
//        if(userId == 0){
//            return "登录失败";
//        }else {
//            StpUtil.login(userId);
//            return "Welcome，"+ num + userService.getNameById(userId);
//        }
//    }

    @PostMapping("/doLogin")
    public Map<String, Object> doLogin(@RequestParam("num") String num, @RequestParam("password") String password) {
        Map<String, Object> response = new HashMap<>();
        int userId = userService.getIdByNumAndPassword(num, password);
        log.warn("已登录，Userid是 " + userId );
        if (userId == 0) {
            response.put("status", 500);
            response.put("message", "登录失败");
        } else {
            StpUtil.login(userId);
            response.put("status", 200);
            response.put("message", "Welcome，" + num + userService.getNameById(userId));
        }
        return response;
    }

    // 查询登录状态，浏览器访问： http://localhost:8080fffffff/user/isLogin
    @GetMapping("/isLogin")
    public boolean isLogin() {
        log.warn("Userid是 " + StpUtil.getLoginIdDefaultNull() );
        return StpUtil.isLogin();
    }

    @PostMapping("/doLogOut")
    public String doLogOut() {
        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
        StpUtil.logout();
        return "注销成功";
    }

    // 查询登录id
    @GetMapping("/getLoginId")
    public int getLoginId() {
        return  StpUtil.getLoginIdAsInt();
    }

//    @GetMapping("/getNameById")
//    public String getNameById(int id){
//        return userService.getNameById(id);
//    }
//
//    @GetMapping("/getNumById")
//    public String getNUMById(int id){
//        return userService.getNameById(id);
//    }

    @GetMapping("/getUserById")
    public User getUserById(int id){
        return userService.getUserById(id);
    }

    @PostMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        log.warn(String.valueOf(user));
        return userService.updateUser(user);
    }






}
