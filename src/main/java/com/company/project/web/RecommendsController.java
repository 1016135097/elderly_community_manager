package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Recommends;
import com.company.project.service.RecommendsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by Mxy's CodeGenerator on 2017/12/29.
*/
@RestController
@RequestMapping("/api/recommends")
public class RecommendsController {
    @Resource
    private RecommendsService recommendsService;

    @PostMapping
    public Result add(@RequestBody Recommends recommends) {
        recommendsService.save(recommends);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        recommendsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Recommends recommends) {
        recommendsService.update(recommends);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Recommends recommends = recommendsService.findById(id);
        return ResultGenerator.genSuccessResult(recommends);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Recommends> list = recommendsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
