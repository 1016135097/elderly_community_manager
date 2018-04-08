package com.stars.project.web;


import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Screening;
import com.stars.project.service.ScreeningService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
* Created by Mxy's CodeGenerator on 2017/12/29.
*/
@RestController
@RequestMapping("/api/screens")
public class ScreensController {
    @Autowired
    private ScreeningService screeningService;

    @ApiOperation("新增场次")
    @PostMapping
    public ResponseEntity add(@RequestBody @Validated Screening screens) {
        return screeningService.insert(screens);
    }

    @ApiOperation("删除场次")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return screeningService.deleteById(id);
    }

    @ApiOperation("更新场次")
    @PutMapping
    public ResponseEntity update(@RequestBody @Validated Screening screens) {
        return screeningService.update(screens);
    }

    @ApiOperation("通过id获取场次信息")
    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        return screeningService.selectOneById(id);
    }

    @ApiOperation("通过参数获取场次信息")
    @GetMapping
    public ResponseEntity list(@RequestParam(value = "name",required = false) String name, @RequestParam(value = "startTime",required = false) String startTime, @RequestParam(value = "endTime",required = false
    ) String endTime, PageInfo pageInfo) {
        Map<String ,Object> map = new HashMap<>();
        map.put("name",name);
        map.put("startTime",startTime);
        map.put("endTime",endTime);
        return screeningService.selectListByMap(map,pageInfo);
    }
}
