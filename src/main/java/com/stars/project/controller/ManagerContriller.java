package com.stars.project.controller;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manager")
public class ManagerContriller {
    @Autowired(required = false)
    public SystemService systemService;

    @GetMapping("/queryPersonal")
    @ResponseBody
    public ResponseEntity queryPersonal(HttpSession session){
        ResponseEntity entity =new ResponseEntity();
        if(session.getAttribute(SystemConst.USERNAME)!=null){
            long id = Long.valueOf(String.valueOf(session.getAttribute("userid"))).longValue();
            entity = systemService.selectSystemUserById(id);
        }
        return entity;
    }

    /**
     * 跳转到个人信息页面
     * @param session
     * @return
     */
    @GetMapping("/queryPersonalMenu")
    public String queryPersonalMenu(HttpSession session){

        return "manager/user/personal";
    }

    /**
     * 跳转到
     * @return
     */
    @GetMapping("/addUser")
    public  String addUser(){
        return "manager/user/useradd";
    }
}
