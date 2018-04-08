package com.stars.project.web;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.User;
import com.stars.project.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
* Created by Mxy's CodeGenerator on 2017/12/27.
*/
@Api(value = "用户控制类")
@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "新增用户")
    @PostMapping
    public ResponseEntity add(@RequestBody User user) {
        return userService.insert(user);
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return  userService.deleteById(id);
    }

    @ApiOperation(value = "更新用户")
    @PutMapping
    public ResponseEntity update(@RequestBody User user) {
        return  userService.update(user);
    }

    @ApiOperation(value = "通过id获取用户的详细信息")
    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        return userService.selectOneById(id);
    }

    @ApiOperation(value = "通过参数获取用户")
    @GetMapping
    public ResponseEntity list(@RequestParam("userName") String userName , @RequestParam("loginName") String loginName, PageInfo pageInfo) {
        Map<String, Object> map = new HashMap<>();
        if(StringUtils.isNotEmpty(userName)){
            map.put("userName",userName);
        }
        if(StringUtils.isNotEmpty(loginName)){
            map.put("loginName",loginName);
        }
        return userService.selectListByMap(map,pageInfo);
    }
}
