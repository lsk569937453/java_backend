package com.lsk.backend.service.impl;

import com.lsk.backend.entity.TaskHistoryEntity;
import com.lsk.backend.mapper.TaskHistoryMapper;
import com.lsk.backend.service.TaskHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;
import java.util.Map;

/**
 * @ClassName : TaskHistoryServiceImpl  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-27 18:16  //Date
 */
@Service
public class TaskHistoryServiceImpl implements TaskHistoryService {
    @Autowired
    private TaskHistoryMapper taskHistoryMapper;
    @Override
    public List<TaskHistoryEntity> getHistoryByCondition(Map<String, Object> condition) {
        return taskHistoryMapper.selectByMap(condition);
    }
}
