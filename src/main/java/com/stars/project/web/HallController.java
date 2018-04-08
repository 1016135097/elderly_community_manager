package com.stars.project.web;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Hall;
import com.stars.project.service.HallService;
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
@Api(value = "影厅控制类")
@RestController
@RequestMapping("/api/hall")
public class HallController {
    @Autowired
    private HallService hallService;

    @ApiOperation("新增影厅")
    @PostMapping
    public ResponseEntity add(@RequestBody @Validated Hall hall) {
        return hallService.insert(hall);
    }

    @ApiOperation(value = "删除影厅")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return hallService.deleteById(id);
    }

    @ApiOperation(value = "更新影厅")
    @PutMapping
    public ResponseEntity update(@RequestBody @Validated Hall hall) {
        return hallService.update(hall);
    }

    @ApiOperation(value = "通过id获取影厅")
    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        return hallService.selectOneById(id);
    }

    @ApiOperation(value = "通过参数获取影厅")
    @GetMapping
    public ResponseEntity list(@RequestParam(value = "userId",required = false) Long userId , @RequestParam(value = "movieId",required = false) Long movieId, PageInfo pageInfo) {
        Map<String ,Object> map = new HashMap<>(2);
        if(userId !=null ){
            map.put("userId",userId);
        }
        if(movieId != null){
            map.put("movieId",movieId);
        }
        return hallService.selectListByMap(map,pageInfo);
    }



}
