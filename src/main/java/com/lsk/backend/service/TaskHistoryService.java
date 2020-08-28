package com.lsk.backend.service;

import com.lsk.backend.entity.TaskHistoryEntity;

import java.util.List;
import java.util.Map;

/**
 * @ClassName : TaskHistoryService  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-27 16:58  //Date
 */
public interface TaskHistoryService {
    /*
    *
     * @Author shikai.liu
     * @Description //TODO
     * @Date 7:57 上午 2020/8/28
     * @Param [condition]
     * @return java.util.List<com.lsk.backend.entity.TaskHistoryEntity>
     **/
    public List<TaskHistoryEntity> getHistoryByCondition(Map<String,Object> condition);
    
}
