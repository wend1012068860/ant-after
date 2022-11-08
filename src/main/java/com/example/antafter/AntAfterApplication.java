package com.example.antafter;

import com.example.antafter.wechat.Pusher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling // 开启定时任务
public class AntAfterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntAfterApplication.class, args);
    }

    // 定时
    @Scheduled(cron = "0 30 7 * * ?")
    public void goodMorning(){
        Pusher.pushMsg();
    }

}
