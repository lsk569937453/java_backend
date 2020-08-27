package com.lsk.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.google.gson.annotations.SerializedName;

/**
 * @ClassName : TaskHistoryEntity  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-27 18:08  //Date
 */
public class TaskHistoryEntity {

    @TableField("task_id")
    private int taskId;
    @TableField("exec_time")
    private String execTime;

    @TableField("exec_result")
    private String execResult;

    @TableField("exec_code")
    private int execCode;
    @TableId(value="id", type= IdType.AUTO)
    private int id;
    @TableField("_timestamp")
    private String timeStamp;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    public String getExecResult() {
        return execResult;
    }

    public void setExecResult(String execResult) {
        this.execResult = execResult;
    }

    public int getExecCode() {
        return execCode;
    }

    public void setExecCode(int execCode) {
        this.execCode = execCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
