package com.lsk.backend.controller;

import com.google.common.collect.Maps;
import com.lsk.backend.entity.TaskEntity;
import com.lsk.backend.service.TaskService;
import com.lsk.backend.vojo.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author shikai.liu
 * @version 1.0
 * @date 2020/8/25 0025 21:31
 */
@RestController
@RequestMapping(value = "/api/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping(value = "/add",produces = "application/json;charset=UTF-8")
    public String addTask(@RequestBody TaskInsertReq taskInsertReq) {
        String sql = "update t_user set name = ? where id = ?";
        taskService.getAllTask();
        return "a";
    }
    @PostMapping(value = "/getByUserId",produces = "application/json;charset=UTF-8")
    public String getTaskByUserId(@RequestBody GetTaskByUserIdReq req) {
        Map<String,Object> condition= Maps.newHashMap();
        condition.put("user_id",req.getUserId());
        List<TaskEntity> taskEntityList=taskService.getTaskByCondition(condition);
        return "a";
    }
    @PostMapping(value = "/getById",produces = "application/json;charset=UTF-8")
    public String getTaskById(@RequestBody GetTaskByIdReq req) {
        Map<String,Object> condition= Maps.newHashMap();
        condition.put("id",req.getId());
        List<TaskEntity> taskEntityList=taskService.getTaskByCondition(condition);
        return "a";
    }
    @PostMapping(value = "/updateById",produces = "application/json;charset=UTF-8")
    public String updateTaskById(@RequestBody TaskUpdateReq req) {
        String sql = "update t_user set name = ? where id = ?";
        taskService.getAllTask();
        return "a";
    }
    @PostMapping(value = "/delById",produces = "application/json;charset=UTF-8")
    public String delTaskById(@RequestBody TaskDelByIdReq req) {
        String sql = "update t_user set name = ? where id = ?";
        taskService.getAllTask();
        return "a";
    }
}
