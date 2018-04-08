package com.stars.project.web;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Discount;
import com.stars.project.service.DiscountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : WuWei
 * @Date : Created on 21:18 2018/3/29
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Api(value = "折扣控制类")
@RestController
@RequestMapping("/api/discount")
public class DiscountController {
    @Autowired
    private DiscountService discountService;

    @ApiOperation("新增折扣")
    @PostMapping
    public ResponseEntity add(@RequestBody @Validated Discount discount) {
        return discountService.insert(discount);
    }

    @ApiOperation(value = "删除折扣")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return discountService.deleteById(id);
    }

    @ApiOperation(value = "更新折扣")
    @PutMapping
    public ResponseEntity update(@RequestBody @Validated Discount discount) {
        return discountService.update(discount);
    }

    @ApiOperation(value = "通过id获取折扣")
    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        return discountService.selectOneById(id);
    }

    @ApiOperation(value = "通过参数获取折扣")
    @GetMapping
    public ResponseEntity list(@RequestParam(value = "userId",required = false) Long userId , @RequestParam(value = "movieId",required = false) Long movieId, PageInfo pageInfo) {
        Map<String ,Object> map = new HashMap<>(2);
        if(userId !=null ){
            map.put("userId",userId);
        }
        if(movieId != null){
            map.put("movieId",movieId);
        }
        return discountService.selectListByMap(map,pageInfo);
    }



}
