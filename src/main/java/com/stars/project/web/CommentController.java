package com.stars.project.web;

import com.stars.project.core.entity.PageInfo;
import com.stars.project.core.entity.ResponseEntity;
import com.stars.project.entity.Comment;
import com.stars.project.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : mxy
 * @Date : Created on 16:51 2018/3/20
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Api(value = "用户评论控制类")
@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @Autowired
    private CommentService commentsService;

    @ApiOperation("新增评论")
    @PostMapping
    public ResponseEntity add(@RequestBody @Validated Comment comments) {
        return commentsService.insert(comments);
    }

    @ApiOperation(value = "删除评论")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        return commentsService.deleteById(id);
    }

    @ApiOperation(value = "更新评论")
    @PutMapping
    public ResponseEntity update(@RequestBody @Validated Comment comments) {
        return commentsService.update(comments);
    }

    @ApiOperation(value = "通过id获取评论")
    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        return commentsService.selectOneById(id);
    }

    @ApiOperation(value = "通过参数获取评论")
    @GetMapping
    public ResponseEntity list(@RequestParam(value = "userId",required = false) Long userId , @RequestParam(value = "movieId",required = false) Long movieId, PageInfo pageInfo) {
        Map<String ,Object> map = new HashMap<>(2);
        if(userId !=null ){
            map.put("userId",userId);
        }
        if(movieId != null){
            map.put("movieId",movieId);
        }
        return commentsService.selectListByMap(map,pageInfo);
    }
}
