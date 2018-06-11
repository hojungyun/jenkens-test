package com.example.jenkinstest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AppInit implements ApplicationRunner {

    public void run(ApplicationArguments args) throws Exception {
        log.info("==============================");
        log.info("App runs 3 !!!!!!!!!!");
        log.info("==============================");
    }
}
