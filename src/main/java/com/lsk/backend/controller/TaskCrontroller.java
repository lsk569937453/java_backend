package com.lsk.backend.controller;

import com.lsk.backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author shikai.liu
 * @version 1.0
 * @date 2020/8/25 0025 21:31
 */
@RestController
@RequestMapping(value = "/task", produces = "application/json")
public class TaskCrontroller {
    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/test")
    public String pressureTest(String key) {
        String sql = "update t_user set name = ? where id = ?";
        taskService.getAllTask();
        return "a";
    }
}
