package com.lsk.backend.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName : TaskJob  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-28 09:07  //Date
 */
public class Task implements Job {
    public static Logger logger = LoggerFactory.getLogger(Task.class);

    private int taskID;

//    public Task(int taskID) {
//        this.taskID = taskID;
//    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String des = jobExecutionContext.getJobDetail().getDescription();
        logger.info("ssssss:" + des);
    }
}
