package com.hh.libsemreserve.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.hh.libsemreserve.service.AdminService;
import com.hh.libsemreserve.service.UserService;
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
@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = Url,allowCredentials = "true")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/doLogin")
    public Map<String, Object> doLogin(@RequestParam("name") String name, @RequestParam("password") String password) {
        Map<String, Object> response = new HashMap<>();
        int userId = adminService.getIdByNumAndPassword(name, password);
        if (userId == 0) {
            response.put("status", 500);
            response.put("message", "登录失败");
        } else {
//            StpUtil.login(userId);
            response.put("status", 200);
            response.put("message", "登录成功");
        }
        return response;
    }

}
