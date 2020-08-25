package com.lsk.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.LocalDateTimeTypeHandler;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 * TODO
 *
 * @author shikai.liu
 * @version 1.0
 * @date 2020/8/25 0025 21:27
 */
@TableName("tasks")
public class TaskEntity  {
    /**
     * 主键ID
     */
    @TableId(value="id", type= IdType.AUTO)
    private Integer id;
    /**
     * 账号
     */
    @TableField("task_name")
    private String taskName;
    /**
     * 登录密码
     */
    @TableField("task_cron")
    private String taskCron;
    @TableField("url")

    private String url;
    @TableField("user_id")

    private String userId;
    @TableField(value = "_timestamp",jdbcType = JdbcType.TIMESTAMP)
    private LocalDateTime timeStamp;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskCron() {
        return taskCron;
    }

    public void setTaskCron(String taskCron) {
        this.taskCron = taskCron;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
