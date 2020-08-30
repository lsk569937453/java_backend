package com.lsk.backend;

import com.google.gson.Gson;
import com.lsk.backend.entity.TaskEntity;
import com.lsk.backend.service.TaskService;
import com.lsk.backend.task.ScheduleTask;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @ClassName : ScheduleConfiguration  //className
 * @Description :   //description
 * @Author : shikai.liu  //author
 * @Date: 2020-08-28 09:03  //Date
 */
@Configuration
public class ScheduleConfiguration {
    public static Logger logger = LoggerFactory.getLogger(ScheduleConfiguration.class);

    @Autowired
    private TaskService taskService;

    @Bean
    public Scheduler initScheduler() {
        Scheduler schedule = null;
        StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
        try {


            schedule = stdSchedulerFactory.getScheduler();
            List<TaskEntity>taskEntityList=taskService.getAllTask();

            Gson gson=new Gson();
            for (TaskEntity taskEntity:taskEntityList) {
                try {
                    JobDetail job = JobBuilder.newJob(ScheduleTask.class).withIdentity("job" + taskEntity.getId(), "group1").withDescription(gson.toJson(taskEntity)).build();

                    Trigger cronTrigger = newTrigger()
                            .withIdentity("trigger" + taskEntity.getId(), "group1")
                            .withSchedule(cronSchedule(taskEntity.getTaskCron()))
                            .build();
                    // 将任务和Trigger放入scheduler

                    schedule.scheduleJob(job, cronTrigger);
                }catch (Exception e){
                    logger.error("scheduleJob error",e);
                }
            }
            schedule.start();
        } catch (Exception e) {
            logger.error("", e);
        }
        return schedule;
    }
}
