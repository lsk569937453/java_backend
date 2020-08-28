package com.lsk.backend;

import com.lsk.backend.task.Task;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

    @Bean
    public Scheduler initScheduler() {
        Scheduler schedule = null;
        StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
        try {


            schedule = stdSchedulerFactory.getScheduler();


            for (int i = 0; i < 2; i++) {
                JobDetail job = JobBuilder.newJob(Task.class).withIdentity("job" + i, "group1").withDescription("" + i).build();
                Trigger cronTrigger = newTrigger()
                        .withIdentity("trigger" + i, "group1")
                        .withSchedule(cronSchedule("*/5 * * * * ?"))
                        .build();
                // 将任务和Trigger放入scheduler

                schedule.scheduleJob(job, cronTrigger);
            }
            schedule.start();
        } catch (Exception e) {
            logger.error("", e);
        }
        return schedule;
    }
}
