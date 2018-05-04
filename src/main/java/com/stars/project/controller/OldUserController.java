package com.stars.project.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.model.entity.*;
import com.stars.project.service.ChildrenService;
import com.stars.project.service.IllnessService;
import com.stars.project.service.RetireService;
import com.stars.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/oldUser")
public class OldUserController {
    @Autowired(required = false)
    public UserService userService;
    @Autowired(required = false)
    public ChildrenService childrenService;
    @Autowired(required = false)
    public RetireService retireService;
    @Autowired(required = false)
    public IllnessService illnessService;
    /**
     * 跳转到添加老年人页面
     * @return
     */
    @GetMapping("/addOldUserMenu")
    public String addOldUserMenu(){
        return "manager/oldUser/addOldUser";
    }

    /**
     * 跳转到老年人列表页面
     * @return
     */
    @GetMapping("/oldUserListMenu")
    public String oldUserListMenu(){
        return "manager/oldUser/oldUserList";
    }
    /**
     * 添加老年也基本信息
     * @return
     */
    @PostMapping("/addOldUser")
    @ResponseBody
    public ResponseEntity addOldUser(@RequestParam String oldUser){

        JSONObject object= JSON.parseObject(oldUser);
        UserEntity olduser = JSON.parseObject(JSONObject.toJSONString(object.get("oldUser")), new TypeReference<UserEntity>() {});
        ChildrenEntity child = JSON.parseObject(JSONObject.toJSONString(object.get("child")), new TypeReference<ChildrenEntity>() {});
        RetireEntity retire = JSON.parseObject(JSONObject.toJSONString(object.get("retire")), new TypeReference<RetireEntity>() {});
        IllnessEntity illness= JSON.parseObject(JSONObject.toJSONString(object.get("illness")), new TypeReference<IllnessEntity>() {});

        ResponseEntity entity = userService.addOldUser(olduser);
        olduser = (UserEntity)entity.getData();
        if(olduser.getRetireType() == 0){
            child.setUserId(olduser.getId());
            childrenService.saveChildren(child);
        }
        retire.setUserId(olduser.getId());
        retireService.saveRetire(retire);
        if(illness.getIsillness() == 1){
            illness.setUserId(olduser.getId());
            illnessService.saveIllness(illness);
        }
        return entity;
    }

    /**
     * 查找所有老年人用户
     * @return
     */
    @PostMapping("/getAllOldUser")
    @ResponseBody
    public ResponseEntity getAllOldUser(){
        ResponseEntity entity = userService.selectAllOldUser();
        return entity;

    }
    @GetMapping("/deleteOldUser")
    @ResponseBody
    public ResponseEntity deleteOldUser(HttpServletRequest request){
        long id = Long.parseLong(request.getParameter("id"));
        ResponseEntity entity = userService.deleteOldUser(id);
        return entity;
    }
    /**
     * 跳转到修改用户的页面
     */
    @GetMapping("/modifyOldUserMenu")
    public String modifyOldUserMenu(Model model, HttpServletRequest request){
        String id = request.getParameter("id");
        ResponseEntity entity = userService.selectOldUseById(Long.valueOf(id));
        model.addAttribute("data",entity);
        return "manager/oldUser/oldUsermodify";
    }
    @PostMapping("/modifyOldUser")
    @ResponseBody
    public ResponseEntity modifyOldUser(UserEntity oldUser){
        ResponseEntity entity = userService.addOldUser(oldUser);
        return entity;
    }

    /**
     * 跳转到修改子女信息页面
     * @param model
     * @param request
     * @return
     */
    @GetMapping("/modifyChildMenu")
    public String modifyChildMenu(Model model, HttpServletRequest request){
        String userId = request.getParameter("id");
        ResponseEntity entity = childrenService.selectChildrenByUserId(Long.valueOf(userId));
        model.addAttribute("data",entity);
        return "manager/oldUser/childrenModify";
    }
    @PostMapping("/modifyChild")
    @ResponseBody
    public ResponseEntity modifyChild(ChildrenEntity child){
        ResponseEntity entity = childrenService.saveChildren(child);
        return entity;
    }
    /**
     * 跳转到修改疾病信息页面
     * @param model
     * @param request
     * @return
     */
    @GetMapping("/modifyIllnessMenu")
    public String modifyIllnessMenu(Model model, HttpServletRequest request){
        String userId = request.getParameter("id");
        ResponseEntity entity = illnessService.selectIllnessByUserId(Long.valueOf(userId));
        model.addAttribute("data",entity);
        return "manager/oldUser/illnessModify";
    }
    @PostMapping("/modifyIllness")
    @ResponseBody
    public ResponseEntity modifyIllness(IllnessEntity illness){
        ResponseEntity entity = illnessService.saveIllness(illness);
        return entity;
    }

    /**
     * 跳转到修改退休信息页面
     * @param model
     * @param request
     * @return
     */
    @GetMapping("/modifyRetireMenu")
    public String modifyRetireMenu(Model model, HttpServletRequest request){
        String userId = request.getParameter("id");
        ResponseEntity entity = retireService.selectRetireByUserId(Long.valueOf(userId));
        model.addAttribute("data",entity);
        return "manager/oldUser/retireModify";
    }
    @PostMapping("/modifyRetire")
    @ResponseBody
    public ResponseEntity modifyRetire(RetireEntity retire){
        ResponseEntity entity = retireService.saveRetire(retire);
        return entity;
    }

    /**
     * 跳转到需要帮助的老人的页面
     * @return
     */
    @GetMapping("/queryPersonalMenu")
    public String queryPersonalMenu(){
        return "manager/oldUser/needHelpOldUser";
    }
    @PostMapping("/needHelpOldUser")
    @ResponseBody
    public ResponseEntity needHelpOldUser(){
        ResponseEntity entity = userService.selectNeedHelpOldUser(1);
        return entity;
    }
    @GetMapping("/recieveTask")
    @ResponseBody
    public ResponseEntity recieveTask(HttpSession session, HttpServletRequest request){
        String id = request.getParameter("id");
        String userId =session.getAttribute("userid").toString();
        ResponseEntity entity = userService.recieveTask(Long.valueOf(id),Long.valueOf(userId));
        return entity;
    }

    /**
     * 跳转到已领取任务的页面
     * @return
     */
    @GetMapping("/receivedTaskMenu")
    public String receivedTaskMenu(){
        return "manager/oldUser/receivedTask";
    }
    @PostMapping("/receivedTask")
    @ResponseBody
    public ResponseEntity receivedTask(HttpSession session){
        String userId =session.getAttribute("userid").toString();
        ResponseEntity entity = userService.selectreceivedTask(Long.valueOf(userId));
        return entity;
    }
}
