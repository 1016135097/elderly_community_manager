package com.stars.project.web;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Movie;
import com.stars.project.service.MovieService;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : mxy
 * @Date : Created on 16:51 2018/3/20
 * @Description: 影片控制类
 * @Version : 1.0
 * @Modified By :
 **/
@RestController
@RequestMapping("/api/Movie")
public class MovieController {
    @Resource
    private MovieService movieService;

    @ApiOperation(value = "新增电影")
    @PostMapping
    public ResponseEntity add(@RequestBody Movie movie) {
        return movieService.insert(movie);
    }

    @ApiOperation(value = "删除电影")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return movieService.deleteById(id);
    }

    @ApiOperation(value = "更新电影")
    @PutMapping
    public ResponseEntity update(@RequestBody @Validated Movie movie) {
        return movieService.update(movie);
    }

    @ApiOperation(value = "通过id获取电影信息")
    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        return movieService.selectOneById(id);
    }

    @ApiOperation(value = "通过参数获取电影信息")
    @GetMapping
    public ResponseEntity list(@RequestParam(value = "name",required = false) String name,@RequestParam(value = "year",required = false
    ) Integer year,@RequestParam(value = "type",required = false) Integer type, PageInfo pageInfo) {
        Map<String ,Object> map = new HashMap<>(3);
        if(StringUtils.isNotEmpty(name)){
            map.put("name",name);
        }
        if(year !=null){
            map.put("year",year);
        }
        if(type !=null){
            map.put("type",type);
        }
        return movieService.selectListByMap(map,pageInfo);
    }
}
