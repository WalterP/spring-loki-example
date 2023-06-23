package com.vpontus.springloki;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class DummyService {


    @Scheduled(fixedRate = 5_000)
    @Async
    public void dummyScheduledTask() {
        log.info("Dummy task executed");
    }
}
