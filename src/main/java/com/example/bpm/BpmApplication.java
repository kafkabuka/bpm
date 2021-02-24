package com.example.bpm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BpmApplication {
    private static final Logger log = LoggerFactory.getLogger(BpmApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BpmApplication.class, args);
    }

    @GetMapping("/getLog")
    public String getLog() {
        System.out.println("This is println message. yeah");
        log.info("普通Info信息");
        log.debug("调试debug信息");
        log.error("错误error信息");
        log.warn("警告warn信息");
        return "hello";
    }
}