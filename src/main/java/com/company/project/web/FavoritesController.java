package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Favorites;
import com.company.project.service.FavoritesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by Mxy's CodeGenerator on 2017/12/29.
*/
@RestController
@RequestMapping("/api/favorites")
public class FavoritesController {
    @Resource
    private FavoritesService favoritesService;

    @PostMapping
    public Result add(@RequestBody Favorites favorites) {
        favoritesService.save(favorites);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        favoritesService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Favorites favorites) {
        favoritesService.update(favorites);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Favorites favorites = favoritesService.findById(id);
        return ResultGenerator.genSuccessResult(favorites);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Favorites> list = favoritesService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
