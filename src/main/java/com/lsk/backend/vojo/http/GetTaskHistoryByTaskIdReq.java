package com.lsk.backend.vojo.http;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName : GetTaskHistoryByTaskIdReq  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-27 18:17  //Date
 */
public class GetTaskHistoryByTaskIdReq {
    @SerializedName("task_id")
    private int taskId;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
