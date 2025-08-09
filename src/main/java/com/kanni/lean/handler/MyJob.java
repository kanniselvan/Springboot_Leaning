package com.kanni.lean.handler;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.random.RandomGenerator;

@Component
@Slf4j
public class MyJob {

    Logger logger= LoggerFactory.getLogger(MyJob.class);

    @Scheduled(cron = "0 * * * * ?")
    @SchedulerLock(name = "myJob_scheduledTask", lockAtLeastFor = "5m", lockAtMostFor = "10m")
    public void scheduledTask() {
        logger.info("Started job"+ RandomGenerator.getDefault().toString());
    }
}