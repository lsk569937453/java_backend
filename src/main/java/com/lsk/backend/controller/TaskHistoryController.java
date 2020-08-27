package com.lsk.backend.controller;

import com.google.common.collect.Maps;
import com.lsk.backend.entity.TaskEntity;
import com.lsk.backend.entity.TaskHistoryEntity;
import com.lsk.backend.service.TaskHistoryService;
import com.lsk.backend.service.TaskService;
import com.lsk.backend.vojo.http.GetTaskHistoryByTaskIdReq;
import com.lsk.backend.vojo.http.TaskInsertReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName : TaskHistoryController  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-27 16:53  //Date
 */
@RestController
@RequestMapping(value = "/api/taskHistory")
public class TaskHistoryController {

    @Autowired
    private TaskHistoryService taskHistoryService;

    @PostMapping(value = "/getByTaskId",produces = "application/json;charset=UTF-8")
    public String addTask(@RequestBody GetTaskHistoryByTaskIdReq req) {
        Map<String,Object> condition= Maps.newHashMap();
        condition.put("task_id",req.getTaskId());
        List<TaskHistoryEntity> taskEntityList=taskHistoryService.getHistoryByCondition(condition);
        return "a";
    }
}
