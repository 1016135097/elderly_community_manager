package com.stars.project.controller;

import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.model.entity.UserEntity;
import com.stars.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/oldUser")
public class OldUserController {
    @Autowired(required = false)
    public UserService userService;
    /**
     * 跳转到添加老年人页面
     * @return
     */
    @GetMapping("/addOldUserMenu")
    public String addOldUserMenu(){
        return "manager/oldUser/addOldUser";
    }

    /**
     * 添加老年也基本信息
     * @return
     */
    @PostMapping("/addOldUser")
    @ResponseBody
    public ResponseEntity addOldUser(UserEntity userEntity){
        ResponseEntity entity = userService.addOldUser(userEntity);
        return entity;
    }
}
