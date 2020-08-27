package com.lsk.backend.vojo.http;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName : GetTaskByIdReq  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-27 08:34  //Date
 */
public class GetTaskByIdReq {

    //db id
    @SerializedName("id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
