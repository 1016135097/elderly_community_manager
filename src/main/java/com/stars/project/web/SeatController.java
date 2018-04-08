package com.stars.project.web;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Seat;
import com.stars.project.service.SeatService;
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
@Api(value = "座位控制类")
@RestController
@RequestMapping("/api/seat")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @ApiOperation("新增座位")
    @PostMapping
    public ResponseEntity add(@RequestBody @Validated Seat seat) {
        return seatService.insert(seat);
    }

    @ApiOperation(value = "删除座位")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return seatService.deleteById(id);
    }

    @ApiOperation(value = "更新座位")
    @PutMapping
    public ResponseEntity update(@RequestBody @Validated Seat seat) {
        return seatService.update(seat);
    }

    @ApiOperation(value = "通过id获取座位")
    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        return seatService.selectOneById(id);
    }

    @ApiOperation(value = "通过参数获取座位")
    @GetMapping
    public ResponseEntity list(@RequestParam(value = "userId",required = false) Long userId , @RequestParam(value = "movieId",required = false) Long movieId, PageInfo pageInfo) {
        Map<String ,Object> map = new HashMap<>(2);
        if(userId !=null ){
            map.put("userId",userId);
        }
        if(movieId != null){
            map.put("movieId",movieId);
        }
        return seatService.selectListByMap(map,pageInfo);
    }
}
