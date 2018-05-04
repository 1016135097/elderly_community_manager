package com.stars.project.controller;

import com.stars.project.core.constant.SystemConst;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manager")
public class ManagerController {
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
     * 跳转到用户列表页面
     * @return
     */
    @GetMapping("/queryUserListMenu")
    public  String queryUserListMenu(){
        return "manager/user/userlist";
    }

    /**
     * 修改用户
     */
    @GetMapping("/modifyUser")
    public String modifyUser(Model model, HttpServletRequest request){
        String id = request.getParameter("id");
        ResponseEntity entity = systemService.selectSystemUserById(Long.valueOf(id));
        model.addAttribute("data",entity);
        return "manager/user/usermodify";
    }
}
