package com.lsk.backend.vojo.http;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName : TaskUpdateReq  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-27 08:36  //Date
 */
public class TaskUpdateReq {

    //db id
    private int id;
    //cron expression
    @SerializedName("cron_expression")
    private String cronExpression;
    //task url
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
