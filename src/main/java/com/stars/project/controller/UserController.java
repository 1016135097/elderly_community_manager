package com.stars.project.controller;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.model.entity.SystemUserEntity;
import com.stars.project.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Service;


@Controller
@RequestMapping("/login")
public class UserController {
    @Autowired(required = false)
    public SystemService systemService;
    @GetMapping("/index")
    public String index(HttpSession session) {
        session.setAttribute(SystemConst.USER, null);
        session.setAttribute(SystemConst.USERNAME, null);
        session.setAttribute("userid", null);
        return "login/index";
    }
    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity login(SystemUserEntity user, HttpSession session){
        ResponseEntity entity = systemService.checkUserByName(user);
        //登录的授权处理
        if (entity.getCode() == 1) {
            session.setAttribute(SystemConst.USER, (SystemUserEntity) entity.getData());
            session.setAttribute(SystemConst.USERNAME, ((SystemUserEntity) entity.getData()).getName());
            session.setAttribute("userid", ((SystemUserEntity) entity.getData()).getId());
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

    @PostMapping("/modifySystemUser")
    @ResponseBody
    public ResponseEntity modifySystemUser(SystemUserEntity user){
        ResponseEntity entity = systemService.modifySystemUser(user);
        return entity;
    }
    /**
     * 获取后台首页
     * @return
     */
    @GetMapping("/manager")
    public String  manager(HttpServletRequest request){
        String type=request.getParameter("type");
        if("0".equals(type))
            return "manager/index";
        return "manager/systemindex";
    }
    /**
     * 跳转到用户修改页面
     * @return
     */
    @GetMapping("/userModify")
    public String userModify() {
        return "login/userModify";
    }

    /**
     * 跳转到添加用户页面
     * @return
     */
    @GetMapping("/addUserMenu")
    public String addUserMenu(Model model,HttpServletRequest request) {
        String type = request.getParameter("type");
        model.addAttribute("type", type);
        return "login/userAdd";
    }

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
    @RequestMapping("/getAllUser")
    @ResponseBody
    public ResponseEntity getAllUser(){
        ResponseEntity entity = systemService.selectAllSystemUser();
        return entity;
    }
    @GetMapping("/deleteUser")
    @ResponseBody
    public ResponseEntity deleteUser(HttpServletRequest request){
        long id = Long.parseLong(request.getParameter("id"));
        ResponseEntity entity = systemService.deleteSystemUser(id);
        return entity;
    }
}
