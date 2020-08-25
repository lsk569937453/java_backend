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
    List<TaskEntity> getTask(String likeId);

}
