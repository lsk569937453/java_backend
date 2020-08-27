package com.lsk.backend.service;

import com.lsk.backend.entity.TaskEntity;
import com.lsk.backend.vojo.http.TaskDelByIdReq;
import com.lsk.backend.vojo.http.TaskInsertReq;
import com.lsk.backend.vojo.http.TaskUpdateReq;

import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author shikai.liu
 * @version 1.0
 * @date 2020/8/25 0025 21:31
 */
public interface TaskService
{
    /*
    *
     * @Author shikai.liu
     * @Description //TODO 
     * @Date 8:25 上午 2020/8/26
     * @Param []
     * @return java.util.List<com.lsk.backend.entity.TaskEntity>
     **/
    public List<TaskEntity> getAllTask();

    /*
    *
     * @Author shikai.liu
     * @Description //TODO insert into the task by
     * @Date 2:12 下午 2020/8/27
     * @Param [taskInsertReq]
     **/
    public void addTask(TaskInsertReq taskInsertReq);
    
    /*
    *
     * @Author shikai.liu
     * @Description //TODO get task by condition
     * @Date 2:18 下午 2020/8/27
     * @Param [condition]
     * @return java.util.List<com.lsk.backend.entity.TaskEntity>
     **/
    public List<TaskEntity>getTaskByCondition(Map<String,Object> condition);


    /*
    *
     * @Author shikai.liu
     * @Description //TODO
     * @Date 4:43 下午 2020/8/27
     * @Param [taskInsertReq]
     * @return void
     **/
    public void updateTask(TaskUpdateReq taskInsertReq);
    
    /*
    *
     * @Author shikai.liu
     * @Description //TODO
     * @Date 5:36 下午 2020/8/27
     * @Param [req]
     * @return void
     **/
    public void delTaskById(TaskDelByIdReq req);
}
