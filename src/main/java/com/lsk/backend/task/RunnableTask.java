package com.lsk.backend.task;

import com.lsk.backend.SpringbootUtil;
import com.lsk.backend.entity.TaskEntity;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 *
 * @author shikai.liu
 * @version 1.0
 * @date 2020/8/29 0029 9:33
 */
public class RunnableTask implements Runnable
{
    public static final Logger logger=LoggerFactory.getLogger(RunnableTask.class);
    private TaskEntity taskEntity;

    public RunnableTask(TaskEntity taskEntity) {
        this.taskEntity = taskEntity;
    }

    @Override
    public void run() {
        doReq();

    }
    private void doReq(){
        String responseStr=null;
        try {

            OkHttpClient okHttpClient = SpringbootUtil.getBean(OkHttpClient.class);
            final Request request = new Request.Builder()
                    .url(this.taskEntity.getUrl())
                    .build();
            final Call call = okHttpClient.newCall(request);
            Response response = call.execute();
            responseStr=response.body().string();
            logger.info("res:"+responseStr);
        }catch (Exception e){
            logger.error("",e);
        }
    }


}
