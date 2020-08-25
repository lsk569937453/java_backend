package com.lsk.backend.service.impl;

import com.lsk.backend.entity.TaskEntity;
import com.lsk.backend.mapper.TaskMapper;
import com.lsk.backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author shikai.liu
 * @version 1.0
 * @date 2020/8/25 0025 21:32
 */
@Service
public class TaskServiceImpl implements TaskService
{
    @Autowired
    private TaskMapper taskMapper;
    @Override
    public List<TaskEntity> getAllTask() {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("id", "30");// 写表中的列名

        long start = System.currentTimeMillis();
        List<TaskEntity> users = taskMapper.selectByMap(columnMap);
        List<TaskEntity> users2=taskMapper.getTask("3");
        return users;
    }
}
