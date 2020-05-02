package edu.tute;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class runApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(runApplication.class, args);
        System.out.println("服务启动");
    }

}

