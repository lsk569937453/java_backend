package com.lsk.backend.service.impl;

import com.lsk.backend.entity.TaskEntity;
import com.lsk.backend.mapper.TaskMapper;
import com.lsk.backend.service.TaskService;
import com.lsk.backend.vojo.http.TaskDelByIdReq;
import com.lsk.backend.vojo.http.TaskInsertReq;
import com.lsk.backend.vojo.http.TaskUpdateReq;
import io.lettuce.core.api.sync.RedisCommands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public static Logger logger= LoggerFactory.getLogger(TaskServiceImpl.class);
    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private RedisCommands<String,String>redisClient;
    @Override
    public List<TaskEntity> getAllTask() {
       Map<String, Object> columnMap = new HashMap<>();
//        columnMap.put("id", "30");// 写表中的列名
//
//        long start = System.currentTimeMillis();
//        List<TaskEntity> users = taskMapper.selectByMap(columnMap);
//        List<TaskEntity> users2=taskMapper.getTask("3");
        List<TaskEntity> taskEntityList= taskMapper.selectByMap(columnMap);
        return taskEntityList;
    }

    @Override
    public void addTask(TaskInsertReq taskInsertReq) {
        TaskEntity taskEntity=new TaskEntity();
        taskEntity.setTaskCron(taskInsertReq.getCronExpression());
        taskEntity.setTaskName(taskInsertReq.getName());
        taskEntity.setUrl(taskInsertReq.getUrl());
        taskEntity.setUserId("-1");
        try {
           int row= taskMapper.insert(taskEntity);
        }catch (Exception e){
            logger.error("",e);
        }
    }

    @Override
    public List<TaskEntity> getTaskByCondition(Map<String, Object> condition) {
        return taskMapper.selectByMap(condition);
    }

    @Override
    public void updateTask(TaskUpdateReq taskUpdateReq) {
        TaskEntity taskEntity=new TaskEntity();
        taskEntity.setTaskCron(taskUpdateReq.getCronExpression());
        taskEntity.setId(taskUpdateReq.getId());
        taskEntity.setUrl(taskUpdateReq.getUrl());
        taskMapper.updateById(taskEntity);

    }

    @Override
    public void delTaskById(TaskDelByIdReq req) {
        taskMapper.deleteById(req.getId());

    }
}
