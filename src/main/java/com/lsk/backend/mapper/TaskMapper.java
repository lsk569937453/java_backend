package com.lsk.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lsk.backend.entity.TaskEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TODO
 *
 * @author shikai.liu
 * @version 1.0
 * @date 2020/8/25 0025 21:30
 */
@Mapper
public interface TaskMapper extends BaseMapper<TaskEntity> {
    /*
    *
     * @Author shikai.liu
     * @Description //TODO 
     * @Date 8:28 上午 2020/8/26
     * @Param [likeId]
     * @return java.util.List<com.lsk.backend.entity.TaskEntity>
     **/
    List<TaskEntity> getTask(String likeId);

}
