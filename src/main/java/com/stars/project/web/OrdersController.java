package com.stars.project.web;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Order;
import com.stars.project.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : mxy
 * @Date : Created on 16:51 2018/3/20
 * @Description: 订单控制类
 * @Version : 1.0
 * @Modified By :
 **/
@RestController
@RequestMapping("/api/orders")
public class OrdersController {
    @Resource
    private OrderService orderService;

    @ApiOperation(value = "添加订单")
    @PostMapping
    public ResponseEntity add(@RequestBody @Validated Order order) {
        return orderService.insert(order);
    }

    @ApiOperation(value = "删除订单")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return orderService.deleteById(id);
    }

    @ApiOperation(value = "更新订单")
    @PutMapping
    public ResponseEntity update(@RequestBody @Validated Order order) {
        return  orderService.update(order);
    }

    @ApiOperation(value = "通过id获取订单信息")
    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        return orderService.selectOneById(id);
    }

    @ApiOperation(value = "通过参数获取订单信息")
    @GetMapping
    public ResponseEntity list(@RequestParam("userId") Long userId, @RequestParam("movieId") Long movieId,PageInfo pageInfo) {
        Map<String ,Object> map = new HashMap<>(2);
        if(userId != null){
            map.put("userId",userId);
        }
        if(movieId != null){
            map.put("movieId",movieId);
        }
        return orderService.selectListByMap(map,pageInfo);
    }
}
