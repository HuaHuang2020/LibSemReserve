package com.hh.libsemreserve.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/reservation")
@CrossOrigin(origins = Url,allowCredentials = "true")
public class ReservationController {

}
