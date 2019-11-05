package org.aidan.autobuilddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huxiaoning
 */
@SpringBootApplication
public class AutoBuildDemoApplication {

    public static void main(String[] args) {
        System.out.println("系统正在启动1。");
        SpringApplication.run(AutoBuildDemoApplication.class, args);
    }

}
