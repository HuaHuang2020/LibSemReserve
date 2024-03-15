package com.hh.libsemreserve.controller;

import com.hh.libsemreserve.entity.Roomtype;
import com.hh.libsemreserve.service.RoomtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RequestMapping("/roomtype")
@CrossOrigin( origins = Url , allowCredentials = "true")
public class RoomtypeController {

    @Autowired
    private  RoomtypeService roomtypeService;

    @PostMapping ("/addType")
    public int addType(@RequestBody Roomtype roomType){
        return roomtypeService.addType(roomType.getName(), roomType.getCapacity(), roomType.getReserveDetails());
    }
//    public int addType(String name , String capacity , String reserveDetails){
//        return roomtypeService.addType(name, capacity, reserveDetails);
//    }

    @DeleteMapping("/removeType")
    public int removeType(int id){
        roomtypeService.removeById(id);
        return 1;
    }

    @GetMapping("/getAllTypes")
    public List<Roomtype> selectAllTypes(){
        return roomtypeService.list();
        //不知道能不能行
    }

}
