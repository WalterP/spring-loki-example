package com.vpontus.springloki.module;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class ModuleClass {

    @Scheduled(fixedRate = 4_000)
    public void moduleTask(){
        log.trace("Trace message");
    }

    @Scheduled(fixedRate = 10_000)
    public void errorModule() {
        log.error("Some error");
    }

    @Scheduled(fixedRate = 7_000)
    public void debugMessage() {
        log.debug("Some Debug");
    }

}
