package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerTask {
    Logger logger= LoggerFactory.getLogger(SchedulerTask.class);
   // @Scheduled(cron="* */10 * * * ?")
   @Scheduled(fixedRate = 10000)
    private void process(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time=sdf.format(new Date());
        HttpEmailQQ.sendEmail(time);
        System.out.println(time);


    }
}
