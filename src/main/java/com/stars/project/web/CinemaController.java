package com.stars.project.web;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Cinema;
import com.stars.project.entity.Comment;
import com.stars.project.service.CinemaService;
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
@Api(value = "影院控制类")
@RestController
@RequestMapping("/api/cinema")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @ApiOperation("新增影院")
    @PostMapping
    public ResponseEntity add(@RequestBody @Validated Cinema cinema) {
        return cinemaService.insert(cinema);
    }

    @ApiOperation(value = "删除影院")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return cinemaService.deleteById(id);
    }

    @ApiOperation(value = "更新影院")
    @PutMapping
    public ResponseEntity update(@RequestBody @Validated Cinema cinema) {
        return cinemaService.update(cinema);
    }

    @ApiOperation(value = "通过id获取影院")
    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        return cinemaService.selectOneById(id);
    }

    @ApiOperation(value = "通过参数获取影院")
    @GetMapping
    public ResponseEntity list(@RequestParam(value = "userId",required = false) Long userId , @RequestParam(value = "movieId",required = false) Long movieId, PageInfo pageInfo) {
        Map<String ,Object> map = new HashMap<>(2);
        if(userId !=null ){
            map.put("userId",userId);
        }
        if(movieId != null){
            map.put("movieId",movieId);
        }
        return cinemaService.selectListByMap(map,pageInfo);
    }



}
