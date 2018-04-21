package com.stars.project.controller;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.model.entity.SystemUserEntity;
import com.stars.project.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/login")
public class UserController {
    @Autowired(required = false)
    public SystemService systemService;
    @GetMapping("/index")
    public String index(){
        return "login/index";
    }
    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity login(SystemUserEntity user, HttpSession session){
        System.out.println(user.toString());
        ResponseEntity entity = systemService.checkUserByName(user);
        //登录的授权处理
        if (entity.getCode() == 1) {
            session.setAttribute(SystemConst.USER, (SystemUserEntity) entity.getData());
            session.setAttribute(SystemConst.USERNAME, ((SystemUserEntity) entity.getData()).getName());
        }
        entity.setData(null);
        return entity;
    }
    @PostMapping("/queryUserByNameAndIdNumber")
    @ResponseBody
    public ResponseEntity queryUserByNameAndIdNumber(SystemUserEntity user){
        ResponseEntity entity = systemService.checkUserByNameAndIdNumber(user);
        return entity;
    }
    @PostMapping("/updatePassword")
    @ResponseBody
    public ResponseEntity updatePassword(SystemUserEntity user){
        ResponseEntity entity = systemService.updatePassword(user);
        return entity;
    }
    /**
     * 获取后台首页
     * @return
     */
    @GetMapping("/manager")
    public String   manager(){
        return "manager/index";
    }
    /**
     * 跳转到用户修改页面
     * @return
     */
    @GetMapping("/userModify")
    public String userModify(){
        return "login/userModify";
    }

    /**
     * 跳转到添加用户页面
     * @return
     */
    @GetMapping("/addUserMenu")
    public String addUser() { return "login/userAdd"; }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    @ResponseBody
    public ResponseEntity addUser(SystemUserEntity user){
        ResponseEntity entity = systemService.saveUser(user);
        return entity;
    }
}
