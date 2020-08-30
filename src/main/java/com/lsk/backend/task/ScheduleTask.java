package com.lsk.backend.task;

import com.google.gson.Gson;
import com.lsk.backend.SpringbootUtil;
import com.lsk.backend.entity.TaskEntity;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;

/**
 * @ClassName : TaskJob  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-28 09:07  //Date
 */
public class ScheduleTask implements Job {
    public static Logger logger = LoggerFactory.getLogger(ScheduleTask.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String des = jobExecutionContext.getJobDetail().getDescription();
        submitTask(des);
    }
    /**
     * 
     * submit task 
     * @author
     * @date 2020/8/29 0029 9:52 
     * @return void
     */
    public void submitTask(String taskString){
        Gson gson=new Gson();
        TaskEntity taskEntity=gson.fromJson(taskString,TaskEntity.class);
        ExecutorService executorService=(ExecutorService) SpringbootUtil.getBean("defaultPool");
        executorService.submit(new RunnableTask(taskEntity));
    }

}
