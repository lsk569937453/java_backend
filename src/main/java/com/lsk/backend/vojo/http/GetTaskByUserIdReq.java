package com.lsk.backend.vojo.http;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName : GetTaskByUserIdReq  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-27 08:33  //Date
 */
public class GetTaskByUserIdReq {

    @SerializedName("user_id")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
