package com.justdoit.keller.controller;

import com.justdoit.keller.common.response.Response;
import com.justdoit.keller.common.util.StringUtils;
import com.justdoit.keller.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 管理员功能
 * @author yangkaile
 * @date 2020-04-23 10:37:24
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private UserService userService;

    @GetMapping("/userList")
    public ResponseEntity getUserList(Integer kellerAdminId,Integer page,Integer size,String email){

        if(StringUtils.isEmpty(kellerAdminId,page,size)){
            return Response.badRequest();
        }
        return Response.ok(userService.getUserList(page,size,email));
    }


    @GetMapping("/userCounter")
    public ResponseEntity getUserCounter(Integer kellerAdminId,String email){

        if(StringUtils.isEmpty(kellerAdminId)){
            return Response.badRequest();
        }
        return Response.ok(userService.getUserCounter(email));
    }

}
