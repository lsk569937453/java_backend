package com.lsk.backend.vojo.http;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName : TaskInsertReq  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-27 08:03  //Date
 */
public class TaskInsertReq {

    
    //task name
    @SerializedName("name")
    private String name;
    //cron expression
    @SerializedName("cron_expression")
    private String cronExpression;
    //task url
    @SerializedName("url")
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
